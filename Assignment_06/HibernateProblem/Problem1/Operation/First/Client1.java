package Problem1.Operation.First;

import Problem1.Config.Config;
import Problem1.Entity.Library;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Library login = new Library();
        login.setISBN(3);
        login.setAuthor("Stals");
        login.setPublicationyear("2001");
        login.setTitle("Tracks");
        session.save(login);
        tr.commit();
        session.close();

    }
}