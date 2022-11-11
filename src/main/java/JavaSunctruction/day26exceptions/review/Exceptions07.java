package JavaSunctruction.day26exceptions.review;

public class Exceptions07 {
    public static void main(String[] args) {
        double d= divideStringByTheNumOfTheChar(null);
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
        }catch (NumberFormatException e){
            System.out.println("String den Integer'a dönüştürürken hata oluştu.   "+e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage()+" Lütfen kod satırını gözden geçiriniz "+e.getCause());
            e.printStackTrace();
        }
        return sonuc;
    }
}
