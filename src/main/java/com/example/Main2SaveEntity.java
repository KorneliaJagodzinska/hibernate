package com.example;

import com.example.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2SaveEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();

        session.persist(new Dog ("Burek", "jamnik", 2));
        session.persist(new Dog ("Julke", "terier", 5));
        session.persist(new Dog ("Malinka", "buldog", 3));
        session.persist(new Dog ("Bury", "dalmatynck", 2));
        session.persist(new Dog ("Kundel", "jamnik", 8));
        session.persist(new Dog ("Burek", "kundel", 1));



        transaction.commit();
        session.close();
    }
}
