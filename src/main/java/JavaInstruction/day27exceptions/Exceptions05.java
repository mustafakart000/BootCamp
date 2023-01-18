package JavaSunctruction.day27exceptions;

public class Exceptions05 {
    public static void main(String[] args) throws IllegalGradeException,IllegalNameException{
     gradePrint(100);
     CheckNameFormat2("ustafa");
    }

    public static void gradePrint(double grade) throws IllegalGradeException{

        if (grade<=0||grade >=100){
            throw new IllegalGradeException("grade 0'dan az 100 den fazla olamaz.");
        }
        else {
            System.out.println(grade);

        }
    }
    public static boolean CheckNameFormat2(String name) throws  IllegalNameException{
        if(name.charAt(0)>='A'&& name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("Lütfen Class'ların Baş harfinin büyük olmasına dikkat ediniz.");
        }
    }
}
