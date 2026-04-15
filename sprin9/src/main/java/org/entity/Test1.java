package org.entity;

import org.entity.hibernate.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee emp = new Employee(
                "Ira","Moroz", "IT", 500);
        try {
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            //session.close();
        } finally {
            factory.close();
        }
    }
}
