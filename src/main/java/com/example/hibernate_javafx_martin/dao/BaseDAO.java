package com.example.hibernate_javafx_martin.dao;

import java.util.List;

public interface BaseDAO<T> {
   void save(T entity);
   void update(T entity);
   void delete(T entity);
   T findById(Long id);
   List<T> findAll();
}
