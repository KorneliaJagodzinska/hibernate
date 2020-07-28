package com.example;

import com.example.entity.Husband;
import com.example.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main9OneToOne {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Wife ewa = new Wife("Ewa");
        Husband adam = new Husband("Adam");

        session.persist(ewa);
        session.persist(adam);

        adam.setWife(ewa);


        transaction.commit();
        session.close();
    }

}
