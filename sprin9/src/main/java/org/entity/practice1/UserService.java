package org.entity.practice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserService {

    private SessionFactory factory = HibernateUtil.getFactory();

    public void saveUser (User user) {
        Session session = factory.getCurrentSession();

            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            session.close();

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
