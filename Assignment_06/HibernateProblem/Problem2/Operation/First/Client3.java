package Problem2.Operation.First;

import Problem2.Config.Config;
import Problem2.Entity.Employee1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Employee1 login = new Employee1();
        login.setId(2);
        session.delete(login);
        tr.commit();
        session.close();
    }
}