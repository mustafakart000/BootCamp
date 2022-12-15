package JavaSunctruction.day26exceptions.review;

public class Exceptions04 {
    public static void main(String[] args) {
        String str ="123";
        int result= convertStringToInteger(str);
        System.out.println(result+5);
        String st= "1a2b";
        int r= convertStringToInteger(st);//NumberFormatException: eğer içinde rakamdan farklı bir karekter barındıran
                                            // bir String'i valuOf() methodu kullanarak Integer'a çevirmek isterseniz
                                            // NumberFormatException Alırsınızç
        System.out.println(r+10);
    }
    public static int convertStringToInteger(String str){
        int i=0;
        try {
            i= Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karekter içeren String'ler integer'a çevrilemezler");
        }
        return i;
    }
}
