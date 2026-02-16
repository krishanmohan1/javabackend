package com.capg.shadow.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class BankConnectionDAO {

    private static SessionFactory factory;

    static {
        try {
            factory = new AnnotationConfiguration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}
