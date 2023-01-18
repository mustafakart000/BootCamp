package Day01_Practice.Interface;

public class SchoolManagement {
    public static void main(String[] args) {
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

        Student student = new Student("Tolstoy");
        StudentRepo studentRepo =new StudentRepo();
        Teacher teacher=new Teacher("Dostoyevski");
        TeacherRepo teacherRepo =new TeacherRepo();

        studentRepo.add(student);
        studentRepo.update(student);
        studentRepo.get(student);
        studentRepo.delete(student);

        teacherRepo.add(teacher);
        teacherRepo.update(teacher);
        teacherRepo.get(teacher);
        teacherRepo.delete(teacher);


    }
}
