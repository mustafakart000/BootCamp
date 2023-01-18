package JavaSunctruction.day18arraylistssbyvaleu;

public class PassByValue01 {
    public static void main(String[] args) {
      int  x=5;
        System.out.println("x = " + x);//x =
        // static method olan main methodu'un içindeki herşey static olmalıdır.
      change(x);

      System.out.println("x = " + x);//x =

        int ucret=100;
        int kopya= indirim(ucret);//
        System.out.println("kopya = " + kopya);//ucret = 100

/*
1)Java, variable'ların orijinal değerlerini korumak ister.
2)Variable metotlar içinde kullanıldığında, Java metodun içine
orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.
 Note: Java pass by  value kullanır.
 Note: bazı program dilleri orjinal dilleri orjinal koruma altına almamıştır.
 Bu tarz diller "PassbyReference" kullanır.


 */
    }
    public static void change(int a){
        System.out.println(a*3);
    }
    //void dışındaki return typle'larda method badisi içinde return keywod kullanılmalıdır.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }
}
