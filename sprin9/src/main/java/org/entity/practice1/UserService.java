package org.entity.practice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserService {

    private SessionFactory factory;

    public UserService() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }

    public void saveUser (User user) {
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public void findById () {
    }

    public void findAll () {
    }

    public void delete () {
    }

    public void pagination () {
    }
}
