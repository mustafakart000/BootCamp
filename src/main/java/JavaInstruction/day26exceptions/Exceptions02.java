package JavaSunctruction.day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
       char ch1= getCharFromString("Java",2);//v
        System.out.println(ch1);
        char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2);
    }
    public static char getCharFromString(String str, int idx){
        char c=' ';
        try {
            c=str.charAt(idx);
        }catch (Exception e) {
            System.out.println("İndex ile ilgili bir problem olustu.  "+e.getMessage());
            e.printStackTrace();
        }return c;
    }
}
