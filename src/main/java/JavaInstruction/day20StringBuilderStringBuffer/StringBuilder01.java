package JavaSunctruction.day20StringBuilderStringBuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        * 1) StringBuilder Java'da bir Class'dir
        * 2) StringBuilder String Oluşturmaya yarar.
        * 3) "String" Class varken neden "StringBuilder" a ihtiyac duyarız
        * Cunku "String Class "Immutable Class" dir, ama biz bazen "Mutable" String'lere ihtiyac duyarız
        * StringBuilder Bize "Mutable" String verir
        * 4) "ımutable Class" larda varolan deger değiştirelemez  siz varolan bir değeri değiştirmek istediğiniz de
        * i) memory'de yeni bir variable yeni degerle oluşturulur
        *  ii) eski variable'in pointer'i yeni variable 'a döndürülür
        * iii) eger bir variable'e hicbir pointer göstermiyorsa o variable " Garbage Collector" tarafindan silinir.
        *5) String Class'ların immutable yapısı security için öenmlidir. Aynı değere sahip birden fazla string olduğunda
        * java birtane kontenyer oluşturur ve aynı degere sahip stringlerin bu kontenyeri kullanmasını temin eder. bu memory'i
        * korumak için iyidir ancak kontenyer daki değeri bir variable için değiştirdiğimiz de tüm varable'ların
        *  etkilenme tehlikesi vardır. bu tehlikeden kurtulmak için java Stringleri immutable yapmıştır yani değişmez yapmıştır.
        * fakat herhangi bir variable'ın değerini değiştirmek için Java bir yol bulmuştur. Değiştirmek istediğiniz variable için
        * yeni bir contenyer oluşturur ve variable pointerını bu yeni variable'a yönlendirir. hem değişim sağlanmış hemde
        * diğerleri etkilenmemiş olur.
        * "Mutable Class" larda olan deger değiştirilebilir. orjinal değeri korumaz. */
        String str1= "Java";
        str1 ="Super JAva";
        System.out.println("str = " + str1);

        //StringBuilder nasil  oluşturulur ?
        StringBuilder Strb1= new StringBuilder("java");
        System.out.println("Strb = " + Strb1);
        //2.yol:
        StringBuilder strb2= new StringBuilder();
        strb2.append("Java ");//java
        strb2.append("is easy");
        strb2.append("!!!");
        System.out.println("strb2 = " + strb2);
        //Yol b:
        strb2.append(" java ").append(" Java earn").append(" money");
        System.out.println("strb2 = " + strb2);
        //StringBuilder'Lar da chacter sayısı nasıl buluruz
         StringBuilder strb3= new StringBuilder();
         strb3.append("cat");
         strb3.append("xxxxxxxxxxxxxxx");
         int numOfChar=strb3.length();
        System.out.println("numOfChar = " + numOfChar);
        int capacity=strb3.capacity();
        System.out.println("capacity = " + capacity);//capacity = 34
        strb3.append("xxxxxxxxxxxxxxxxx");
        System.out.println("capacity = " + capacity);
        //Capacity asimlarinda capacity var olanin iki katinin iki fazlasına çıkar.

        strb3.setCharAt(3,'r');
        System.out.println("str3 = " + strb3);
        strb3.delete(3,18);
        System.out.println("strb3 = " + strb3);//catxxxxxxxxxxxxxxxxx
        strb3.deleteCharAt(2);
        System.out.println("strb3 = " + strb3);//caxxxxxxxxxxxxxxxxx
        strb3.reverse();
        System.out.println("strb3 = " + strb3);//xxxxxxxxxxxxxxxxxac

        strb3.reverse();
        System.out.println("strb3 = " + strb3);

        String abc= "java";
        abc.replace("a","i"); //abc = java mutable
        System.out.println("abc = " + abc);
        String abc2= "java";
        abc2= abc2.replace("a","i"); //abc = jivi inmutable
        System.out.println("abc2 = " + abc2);
        String Stringstrb3=strb3.toString();
        System.out.println("strb3 = " + Stringstrb3);

        StringBuilder strb4=new StringBuilder(Stringstrb3); // tekrar StringBuilder'e çevirdik
        System.out.println("strb4 = " + strb4);

        strb4.insert(3,"xxxx");
        System.out.println("strb4 = " + strb4);

        strb4.insert(6,"KLMNFKALS",5,8);
        System.out.println("strb4 = " + strb4);

        StringBuilder a= new StringBuilder("Iava");
        StringBuilder b= new StringBuilder("Java");
        int sonuc= a.compareTo(b);
        System.out.println("sonuc = " + sonuc);
        //compareTo methodu 1. durum StringBuilder'lar tamamıyla Aynı ise 0 verir.
        //                  2. a' Alfebetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gösterir
        //                  3. a' Alfebetik sirada b2den once gelirse negatif olarak aradaki alfabetik siralama farkini gösterir

    }
}
