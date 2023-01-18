package Day01.Generics;



import java.util.ArrayList;
import java.util.List;

public class GenericType <T>{

     /*
    E -->used in like Element, collection
    K -->Key
    V --> Value
    N --> Number
    T --> Type
    S, U, V, vb --> 2. , 3. , 4. , types.

     */

    private T type; // field, variable

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }


    //main method

    public static void main(String[] args) {


        //generic yapı kullanılırak aynı class' dan iki farklı data türünde obje oluşturalım.

        GenericType<String> obj1= new GenericType<>();

        //Trick: diamond<> içine non-primitive type kullanabiliriz
        obj1.setType("Generic Types");
        GenericType<Integer> obj2= new GenericType<>();
        obj2.setType(65);

        // Not: Cast probleminden nasıl kurtulurum
        GenericType<Integer> obj3 =new GenericType<>();

        int a= obj3.getType(); //Cast Probleminden Kurtulduk.
        //Not: ClassCastException Probleminden nasıl kurtulurum ?

        List<String> list = new ArrayList<>();

    }
}
