package com.example;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.entity.Gender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class Main7Embeded {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee(
                "Adam",
                "password1",
                "123456669",
                12L,
                new Date(),
                Gender.MALE,
                "long tekst... ",
                new Address("Gdansk", "Malinowa")
        );

        session.persist(employee);

        transaction.commit();
        session.close();
    }
}
