package com.example;

import com.example.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main5Delete {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();

        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();

        Dog dogOne= session.find(Dog.class, 1L);
        session.delete(dogOne);


        transaction.commit();
        session.close();
    }
}
