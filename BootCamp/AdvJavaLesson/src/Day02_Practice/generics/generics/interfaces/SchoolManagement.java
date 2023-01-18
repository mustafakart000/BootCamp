<<<<<<< HEAD
package Day02_Practice.generics.generics.interfaces;
=======
package AdvJavaPractice.generics.interfaces;
>>>>>>> origin/master

import java.util.ArrayList;
import java.util.List;

/*Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
   -oluşturan
   -görüntüleyen
   -güncelleyen
   -silen
   bir program yazınız.

   Her iki sınıf için aynı metodlara ihtiyacımız var(add,delete...).
   İmplement edip bu metodları oluşturabilmek ve her iki classın nesnelerini
   parametre olarak alabilmek için generic tipte
   interface tanımladık.
 */
public class SchoolManagement {
    public static void main(String[] args) {
        Student student = new Student("Tolstoy");
        StudentRepo studentRepo = new StudentRepo();
        Teacher teacher=new Teacher("Dostoyevski");
        TeacherRepo teacherRepo = new TeacherRepo();
        //List<Teacher> teacherList=new ArrayList<>();

        studentRepo.add(student);
        studentRepo.update(student);
        studentRepo.get(student);
        studentRepo.delete(student);

        System.out.println();

        teacherRepo.add(teacher);
        teacherRepo.update(teacher);
        teacherRepo.get(teacher);
        teacherRepo.delete(teacher);



    }
}
