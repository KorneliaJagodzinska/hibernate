package com.example;

import com.example.entity.Book;
import com.example.entity.Client;
import com.example.entity.Husband;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Set;

public class Main12OneToMany {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = new Client("Kornelia");


        client.addBook(new Book("book1"));
        client.addBook(new Book("book2"));
        client.addBook(new Book("book3"));
        client.addBook(new Book("book4"));
        client.addBook(new Book("book5"));
        client.addBook(new Book("book6"));
        client.addBook(new Book("book7"));


        session.persist(client);


        transaction.commit();
        session.close();
    }
}
