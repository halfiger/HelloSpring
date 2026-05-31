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
        List<User> list = session.createQuery("from User", User.class).getResultList();
        session.getTransaction().commit();
        System.out.println("find all done marker");
        return list;
    }

    public List<User> findUsersOlderThan(int age) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<User> list = session.createQuery("from User u where u.age > :age").setParameter("age", age).getResultList();
        session.getTransaction().commit();
        return list;
    }

    public User updateUserEmail(String newEmail, Long id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        if (user != null) {
            user.setEmail(newEmail);
        }
        session.getTransaction().commit();
        return user;
    }

    public User updateUserName(String newName, Long id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        if (user != null) {
            user.setName(newName);
        }
        session.getTransaction().commit();
        return user;
    }


    public List<User> pagination(int page, int size) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<User> list = session
                .createQuery(
                        "FROM User u ORDER BY u.id",
                        User.class
                )
                .setFirstResult(page * size)
                .setMaxResults(size)
                .getResultList();
        session.getTransaction().commit();
        return list;
    }

    public Boolean deleteById(Long id) {
        Boolean deleted = false;
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, id);

        if (user != null) {
            session.remove(user);
            deleted = true;
        }
        return deleted;
    }

    public User findByEmail (String email) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user = session.createQuery("From User u where u.email = :email", User.class).setParameter("email", email).getSingleResult();
        session.getTransaction().commit();
        return user;
    }

    public List <User> findByNameContains (String sentence) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List <User>list;
        list = session.createQuery("from User u where u.name like :sentence", User.class)
                .setParameter("sentence", "%"+sentence+"%").getResultList();
        session.getTransaction().commit();
    return list;
    }


}
