package java.com.dao;

import java.com.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDAO {
 public static int addBook(Book b1)
 {
 Configuration config = new Configuration();
 config.configure("hibernate.cfg.xml");
 
     SessionFactory sf =  config.buildSessionFactory();
      Session sess =  sf.openSession();
      Transaction tr=sess.beginTransaction();
      
       int idd =(int) sess.save(b1);
       tr.commit();
       sess.close();
       return idd;
 
 
 }
}

    

