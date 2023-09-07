package Problem1.Operation.Fourth;

import Problem1.Config.Config;
import Problem1.Entity.Library;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client8 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();      
        Library libary = session.get(Library.class,2);
        session.delete(libary);
        tr.commit();
        session.close();
    }
}