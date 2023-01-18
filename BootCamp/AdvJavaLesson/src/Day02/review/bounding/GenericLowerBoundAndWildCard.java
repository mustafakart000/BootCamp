package Day02.review.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {

    public static void main(String[] args) {
        List<? super Integer> ol= new ArrayList<>();
        addElements(ol);
        List<Number> nl = new ArrayList<>();
        addElements(nl);

        List<Double> dl =new ArrayList<>();
        //addElements(dl);//Compile Time error verir bu istediğimiz birşeydir çünkü parent class'lar ile sınırladığımız için
    }
    public static void addElements(List<?super Integer> list){
        // ?: soru işareti wilcard demektir (tipi bilinmeyen). super, alt class'ı Integer Olan parent'leri getirir.
        for (int i=1; i<=10; i++){
            list.add(i);

        }
    }
    //WilCard dezavAntajları.
    public static void printElementsUnderBoundering(List<?> listOfunknown){
        //listOfunknown.add("Java");// ? soru işaretinden dolayı data türü netleşmeden add methodu gibi işlemleri yaptırmaz
        listOfunknown.add(null);// illa eklenecekse null eklenir

    }
}
