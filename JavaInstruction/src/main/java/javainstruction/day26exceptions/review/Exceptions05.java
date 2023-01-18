package JavaSunctruction.day26exceptions.review;

public class Exceptions05 {
    public static void main(String[] args) {
        char ch1 =getCharFromString("Java",2);
        char ch2= getCharFromString("Selenium", 8);//StringIndexOutOfBoundsException
    }
    public static char getCharFromString(String str, int idx){
        char c= ' ';
        try {
           c= str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("var olmayan index değeri girdiniz. "+e.getMessage());
            System.err.println("Lütfen istenen karekter sayısı aralığında index giriniz. "+e.getMessage());
            e.printStackTrace();
        }
        return c;
    }
}
