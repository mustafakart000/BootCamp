package JavaSunctruction.day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        //Verilen iki String'den birinin karekter sayısının diğerinin
        // kaç katı olduğunu veren method olusturunuz.

        double r1= compareNumOfCharacters("Java","xy");
        System.out.println(r1);

        }
    public static double compareNumOfCharacters(String s, String t){
        double result=0;
        try {
           result= s.length()/t.length();

       } catch (NumberFormatException e) {
            System.out.println("length() method'u null ile kuallanilamaz. ");


       }
        catch (ArithmeticException e){
            System.out.println("Herhangibir Sayi sıfır ile bölünemez.");

        }finally {
            System.out.println("Databes ile connection kesildi");
        }
        return result;
        //Java da birbirine benzeyen 3 tane keyword var final, finally ve finalize
//        1-) final bir keyword'dur variable, class, ve methodl'lar için kullanlır.
//        2-) "finally" bir "code block" ile kullanılır.
                //"try-catch" veya "try ile kullanılır
                // finally code block içine yazılan herşey çalıştırılır
                // database ile connection'i kesmek için herzaman yapilmasi gereken bir fiildir. Bunu "finally" ile kullanırız.
//        3-) finalize bir method'dur bu method java tarafından datalar imha edilmeden önce cagrilir, java bu method data'lari
//        imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'yi imha eder.
//        "finalize" Java finalize edilmemiş hiçbirşeyi garbege collector, imha etmez.
//        finalize method'unu java developer'lar da çağırabilir ancak java kendi bildiğini yapar sizin onu çağırmanızın çok bir etkisi yoktur
    }
}
