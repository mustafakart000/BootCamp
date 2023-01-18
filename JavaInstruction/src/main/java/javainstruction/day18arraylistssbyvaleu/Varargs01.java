package JavaSunctruction.day18arraylistssbyvaleu;

public class Varargs01 {
    /*
    * 1-) farklı sayilardaki parametrelerle calışabilen bir method oluşturmak isterseniz "varargs kullanmalısınız
    *  2)"varargs" arka tarafta "Array" kullanır, bu yüzden "varargs" larla çalışırken "Array"lerle çalışıyormuş gibi davranabilirsiniz.
    * 3-) "varargs" oluşturmak için "<data type>... <varargs ismi>"
    * 4-) bir method'da "varargs" in yanında başka bir parametre kullanılabilir mi?
     *      cvp: varargs en sonda olmak şartı ile kullanılır
     * 5-) Bir method' da birden fazla varargs kullanabilir mi ?
     *      cvp:kullanildiginda en az bir varargs en sonda olmayacaktır. Bu da 4. madde ile celisir. */
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 8;
        int w = 1;

        int r1=add(2,3,4);
        System.out.println("r1 = " + r1);

//        int top = toplam(x, y);
//        System.out.println("top = " + top);
//
//        int top4 = toplam4(x, y, z, w);
    }

    //iki sayinin toplamini return eden bir method oluşturunuz
//    public static int toplam(int a, int b) {
//        return a + b;
//    }

    //dort sayinin toplamini return eden bir method oluşturunuz
//    public static int toplam4(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
    //Istediğimiz kadar sayiyi toplayabileceğimiz bir method oluşturalım

    public static int add(int ...a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
    return sum;

    }
}