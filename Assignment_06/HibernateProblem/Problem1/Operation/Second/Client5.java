package Problem1.Operation.Second;

import Problem1.Config.Config;
import Problem1.Entity.Library;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Client5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        criteria.add(Restrictions.eq("ISBN",1));
        List<Library> list = criteria.list();
        for (Library employee:list ) {
            System.out.println(employee);
        }

        tr.commit();
        session.close();
    }

}