package Problem1.Operation.Second;

import Problem1.Config.Config;
import Problem1.Entity.Library;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Client6 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.sf();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        criteria.setProjection(Projections.property("title"));
        List<Library> list = criteria.list();
        System.out.println(list);

        tr.commit();
        session.close();
    }
}