package com.example.hibernate_javafx_martin.dao;

import com.example.hibernate_javafx_martin.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.function.Consumer;

public class BaseDAOImpl<T> implements BaseDAO<T> {
    private Class<T> type;

    public BaseDAOImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public void save(T entity) {
        executeInsideTransaction(session -> session.save(entity));
    }

    @Override
    public void update(T entity) {
        executeInsideTransaction(session -> session.update(entity));
    }

    @Override
    public void delete(T entity) {
        executeInsideTransaction(session -> session.delete(entity));
    }

    @Override
    public T findById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(type, id);
        }
    }

    @Override
    public List<T> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from " + type.getName(), type).getResultList();
        }
    }

    private void executeInsideTransaction(Consumer<Session> action) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            action.accept(session);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}
