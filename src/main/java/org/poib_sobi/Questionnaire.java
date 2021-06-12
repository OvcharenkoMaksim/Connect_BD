package org.poib_sobi;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import java.util.Iterator;

public class Questionnaire {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("не удалось создать объект конфигурации." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Questionnaire ME = new Questionnaire();

        /* List down all the employees */
        ME.listEmployees();
    }


    /* Method to  READ all the employees */
    public void listEmployees( ){
        Session session = factory.openSession();
        Transaction tx = null;
        String s = "Светлана Ю. Гавриш";
        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("SELECT systemname FROM userinfo WHERE name = s").list();
            /*for (Iterator iterator = ((java.util.List<?>) employees).iterator(); iterator.hasNext();){
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("  Last Name: " + employee.getLastName());
                System.out.println("  Salary: " + employee.getSalary());
            }*/
            System.out.println("  Системное имя: " + employees.setSystemname());
            tx.commit();
        } catch (org.hibernate.HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }




}

