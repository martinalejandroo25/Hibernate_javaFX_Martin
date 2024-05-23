package com.example.hibernate_javafx_martin.utils;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.imageio.spi.ServiceRegistry;
import javax.security.auth.login.Configuration;

public class HibernateUtil {
    Configuration configuration = new Configuration().configure("hibernate.cfs.xml");
    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();
    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
}
