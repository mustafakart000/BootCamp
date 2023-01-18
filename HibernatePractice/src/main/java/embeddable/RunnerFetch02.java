package embeddable;

import com.tpe.annotations.Developer01;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch02 {
    public static void main(String[] args) {
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer02.class);


        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();

        Transaction tx= session.beginTransaction();

        //3-hql ile ismi 'Shrek' olan datayı çekiniz.
        String hqlQuery2="FROM Developer02 WHERE id=1";
        List<Developer02> resultList3=session.createQuery(hqlQuery2, Developer02.class).getResultList();
        System.out.println("---HQL---");
        System.out.println(resultList3.toString());

        Developer02 dev= session.get(Developer02.class,1L);
        System.out.println(dev.getEducation());


        tx.commit();
        sf.close();
        session.close();
    }
}
