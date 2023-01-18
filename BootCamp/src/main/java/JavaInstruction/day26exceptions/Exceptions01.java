package JavaSunctruction.day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);
        String str2 = "1a2b";
        int result2 = convertStringToInteger2(str2);
        System.out.println(result2+10);
    }
    //Herhangi bir satirda "Exception" atilirsa Java direkt "catch"
    // bolumune gecer try icindeki sonraki kodlari calistirmaz
    public static int convertStringToInteger(String str) {
        return Integer.valueOf(str);
    }

    public static int convertStringToInteger2(String str2) {
        int i = 0;
        try {
            i = Integer.valueOf(str2);//NumberFormatException: Eger icinde rakamdan farkli character barindiran bir String'i
            //                       valueOf() kullanark Integer'a cevirmek isterseniz NumberFormatException alirsiniz
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez.");
        }

        return i;
    }

}