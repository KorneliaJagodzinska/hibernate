package com.example;

import com.example.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main3PersistenceExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();

        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();

        Dog dog = new Dog("Reksio", "husky", 6);
        System.out.println(dog.getId());
        session.persist(dog);
        System.out.println(dog.getId());
        dog.setAge(8);

        transaction.commit();
        session.close();
    }
}
