package com.example;

import com.example.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main4FindExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();

        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();

        Dog dogOne= session.find(Dog.class, 1000L);
        Dog dogTwo= session.get(Dog.class, 2L);

        System.out.println(dogOne);
        System.out.println(dogTwo);

        Dog dogThree= session.load(Dog.class, 3L);
        if(dogThree!= null){
            System.out.println(dogThree.getName());
        }

        Dog dogFour= session.load(Dog.class, 4000L);
        if(dogFour!= null){
            System.out.println(dogFour.getName());
        }


        transaction.commit();
        session.close();

    }
}
