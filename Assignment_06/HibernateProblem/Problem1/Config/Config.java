package Problem1.Config;

import Problem1.Entity.Library;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  final class Config {
    public static SessionFactory sf(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Library.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }
}
