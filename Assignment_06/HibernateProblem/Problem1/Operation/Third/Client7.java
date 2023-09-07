package Problem1.Operation.Third;

import Problem1.Config.Config;
import Problem1.Entity.Library;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client7
{
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Library login = new Library();
        login.setISBN(1);
        login.setAuthor("Suraj");
        login.setPublicationyear("2002");
        login.setTitle("Tear it");
        session.update(login);
        tr.commit();
        session.close();

    }
}