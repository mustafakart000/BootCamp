package JavaSunctruction.day26exceptions.review;

public class Exceptions03 {
    public static void main(String[] args) {
        String str="Ali";
        String s="";
        String t=null;
        getNumOfChars(s);

    }
    public static void getNumOfChars(String str){
        try {
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("length metodunda bir problem oluştu. "+ e.getMessage());
            e.printStackTrace();
            e.getMessage();
        }
    }
    //Bir String'te bulunan karekterlerin sayisini bulabilmek için bir kod yazınız.
}
