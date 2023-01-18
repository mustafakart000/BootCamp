package Day01_Practice.Interface;

public class StudentRepo implements Repository<Student> {
    @Override
    public void add(Student student) {
        System.out.println(student.getName()+"Başarı ile kaydedildi");
    }

    @Override
    public void get(Student student) {
        System.out.println(student.getName()+"Başarıyla bulundu");
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getName()+"Başarıyla Güncellendi");

    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName()+"Başarıyla silindi");

    }
}
