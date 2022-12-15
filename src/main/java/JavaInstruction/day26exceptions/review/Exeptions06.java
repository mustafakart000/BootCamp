package JavaSunctruction.day26exceptions.review;

public class Exeptions06 {
    public static void main(String[] args) {
        double d= divideStringByTheNumOfTheChar("123a");
        //double d2= divideStringByTheNumOfTheChar(null);//NullPointerException: "null" String ile "length()" kullanildiğinda alinir.

        System.out.println(d);
    }
    public static double divideStringByTheNumOfTheChar(String str){
        int length =0;
        int i=0;
        double sonuc=0;
        try {
            length =str.length();//NullPointerException: "null" String ile "length()" kullanildiğinda alinir.
            i= Integer.valueOf(str);//NumberFormatException: İçinde rakamdan farkli karekter olan String'ler valuOf()
            // ile kullanıldığında
            sonuc= i/length;
        }catch (NullPointerException e){
            System.out.println(e.getMessage()+" "+e.getCause());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
}
