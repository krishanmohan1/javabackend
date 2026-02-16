package com.capg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployeeClient {

    public static void main(String[] args) {

        SessionFactory factory = new AnnotationConfiguration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee e = new Employee();
        e.setFirstName("Ram");
        e.setLastName("Sharma");
        e.setSalary(50000);

        session.save(e);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("Inserted Successfully");
    }
}
