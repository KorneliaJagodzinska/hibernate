package com.example;

import com.example.entity.Husband;
import com.example.entity.School;
import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main15HQL {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query firstQuery = session.createQuery("FROM Husband");
        List<Husband> resultList = firstQuery.getResultList();
        resultList.stream().map(Husband::getName).forEach(System.out::println);

        Query secondQuery = session.createQuery("SELECT h.name FROM Husband AS h");
        List<String> resultList2 = secondQuery.getResultList();
        resultList2.stream().forEach(System.out::println);


        transaction.commit();
        session.close();
    }

}
