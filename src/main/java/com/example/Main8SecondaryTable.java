package com.example;

import com.example.entity.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main8SecondaryTable {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Shop shop= new Shop(
                "lidl",
                "Gdansk",
                "Lidlowa"
        );
        Shop shop2= new Shop(
                "biedronka",
                "Gdansk",
                "Lidlowa"
        );
        Shop shop3= new Shop(
                "mrowka",
                "Gdansk",
                "Lidlowa"
        );

        session.persist(shop);
        session.persist(shop2);
        session.persist(shop3);

        transaction.commit();
        session.close();
    }



}
