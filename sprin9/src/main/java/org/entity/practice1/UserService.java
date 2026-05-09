package org.entity.practice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserService {

    private SessionFactory factory = HibernateUtil.getFactory();

    public void saveUser(User user) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }

    public User findById(Long id) {

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        return user;
    }

    public List<User> findAll() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<User> list = session.createQuery("from Users").getResultList();
        session.getTransaction().commit();
        System.out.println("find all done marker");
        return list;
    }

    public void delete() {
    }

    public void pagination() {
    }
}
