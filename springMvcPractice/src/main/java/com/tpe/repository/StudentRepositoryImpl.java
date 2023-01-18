package com.tpe.repository;

import com.tpe.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository //repository aynı zamanda component'ın gorevini de yapıyor ancak repository ayıran diğer bir özellik
// database ile iletişime geçeceğini söylüyorsunuz. bu class'ı oluşturmamızın amacı da service den aldığımız datayı
// database'e iletmektir.
public class StudentRepositoryImpl implements StudentRepository {


    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public List<Student> getAll() {
        Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        List<Student> listOfStudent=
        session.createQuery("From Student", Student.class).getResultList();

        tx.commit();
        session.close(); //sessionFactory close yapmıyoruz çünkü aynı application diğer methodlar içinde kullanabiliriz
        return listOfStudent;
    }

    @Override
    public Optional<Student> findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();

        Student student = session.get(Student.class, id);
        Optional<Student> opt;
        opt = Optional.ofNullable(student);//eğer dönen değer null ise içi boş bir student object'i döndürür.
        tx.commit();
        session.close(); //sessionFactory close yapmıyoruz çünkü aynı application diğer methodlar içinde kullanabiliriz

        return opt;
    }

    @Override
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();

        session.saveOrUpdate(student);//Db de bu obje varsa update yoksa yeni obje oluştur.



        tx.commit();
        session.close(); //sessionFactory close yapmıyoruz çünkü aynı application diğer methodlar içinde kullanabiliriz

    }

    @Override
    public void update(Student student) {

        Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();

        session.update(student);

        tx.commit();
        session.close(); //sessionFactory close yapmıyoruz çünkü aynı application diğer methodlar içinde kullanabiliriz

    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();

        session.load(Student.class, id); //load'da proxy olarak geliyor object olarak değil sanal olarak geliyor
        // boş yere field'ları almamak için load kullanıyoruz
        session.delete(id);

        tx.commit();
        session.close(); //sessionFactory close yapmıyoruz çünkü aynı application diğer methodlar içinde kullanabiliriz

    }
}
