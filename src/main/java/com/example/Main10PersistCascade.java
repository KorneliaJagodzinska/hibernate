package com.example;

import com.example.entity.Husband;
import com.example.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main10PersistCascade {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Wife wife = new Wife("Ola");
        Husband husband = new Husband("Bartek");

        session.persist(husband);
        session.persist(wife);

        wife.setHusband(husband);

        transaction.commit();
        session.close();
    }
}
