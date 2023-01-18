package day01Lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

public class Lambda01 {
     /*
	 	1)  Lambda --> method create  etme değil mevcut method'ları(library)secip kullanmaktır...
	 	    Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
	 	2)	"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	    "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3)  "Functional Programming" hiz, code kisaligi, code okunabilirligi
	     	ve hatasiz code yazma acilarindan cok faydalidir.
	 	4)  Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir
	 	ancak map'lerde kullanılmaz.
      */

    public static void main(String[] args) {

        List<Integer> sayi= new ArrayList<>(asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

        printElstructured(sayi);
        System.out.println("\n-----------------------------------------");
        printElFunctional(sayi);
        System.out.println("\n-----------------------------------------");
        printElFunctional1(sayi);
        System.out.println("\n-----------------------------------------");
        printElFunctional2(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftOtzDortKucukFunctional3(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftOtzDortKucukFunctional2(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftOtzDortKucukFunctional(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftOtzDortKucukFunctional4(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftElFunctonal(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftElFunctonal3(sayi);
        System.out.println("\n-----------------------------------------");
        printCiftElFunctonal2(sayi);

    }

//----------------------------------------------------------------------------------------------------------------------
//TASK  : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printElstructured(List<Integer> sayi){
        for(Integer w:sayi){
            System.out.print(w + " ");
        }
    }
//TASK  : "functional Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElFunctional(List<Integer> sayi){
        sayi.stream().
                forEach(t-> System.out.print(t+" "));
    }
    public static void printElFunctional1(List<Integer> sayi){
        sayi.stream().
                forEach(System.out::print);
    }
//----------------------------------------------------------------------------------------------------------------------
    // ---> kendimiz bir method oluşturalım yukardaki rakamları boşluksuz örneği bu method sayesinde boşluk verelim

    public static void yazdir(int a){
        System.out.print(a+" ");
    }
    public static void yazdir(String a){
        System.out.print(a+" ");
    }
    public static void printElFunctional2(List<Integer> sayi) {
        sayi.
                forEach(Lambda01::yazdir);
    }
//----------------------------------------------------------------------------------------------------------------------
    //TASK  : functional Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk
    // birakarak print ediniz.

    public static void printCiftElFunctonal(List<Integer> sayi){
        System.out.println("functional Programming ile list elemanlarinin  cift olanlari");
        sayi.stream().filter(t-> t%2==0).forEach(Lambda01 ::yazdir);

    }
    //yukardaki task'i filter() kısmını method refarence method referance ile yapalım.
    public static boolean ciftBul(int a){
        return a%2==0;
    }
    public static void printCiftElFunctonal3(List<Integer> sayi){
        System.out.println("functional Programming ile list elemanlarinin  cift olanlari");
        sayi.stream().filter(Lambda01::ciftBul).forEach(Lambda01 ::yazdir);

    }


    //TASK  : structural Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElFunctonal2(List<Integer> sayi){
        System.out.println("structural Programming ile list elemanlarinin  cift olanlari");
        for (Integer w: sayi){
            if (w%2==0){System.out.println(w+" ");}
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanlarini ayni satirda aralarina
    // bosluk birakarak print ediniz.

    public static void printCiftOtzDortKucukFunctional(List<Integer> sayi){
        sayi.stream().
                filter(t->t%2==0 && t<34).
                forEach(Lambda01::yazdir);
    }//iki koşullu durumu && yerine iki filter kullanarak da yapabiliriz
    public static void printCiftOtzDortKucukFunctional2(List<Integer> sayi){
        sayi.stream().
                filter(t->t%2==0).
                filter(t->t<34).
                forEach(Lambda01::yazdir);
    }
//----------------------------------------------------------------------------------------------------------------------
//Task (İki Filter() method kullanarak): functional Programming ile list elemanlarinin 34 den kucuk veya cift olanlarini
// ayni satirda aralarina bosluk birakarak print ediniz.

public static void printCiftOtzDortKucukFunctional3(List<Integer> sayi){
        sayi.stream().
                filter(t-> t%2==0 || t>34).
                forEach(Lambda01::yazdir);
        }
    public static void printCiftOtzDortKucukFunctional4(List<Integer> sayi){
        sayi.stream(). //akış başladı
                filter(t-> t%2==0).
                filter(t->t>34).
                forEach(Lambda01::yazdir);
    }
}
