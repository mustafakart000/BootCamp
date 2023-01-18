package Day01.review.basicGeneric;
//Bu class'ın bir generic type olduğunu belirtmek için class isminden sonra diamond işearetleme kullanılır <>
public class GenericType <T>{
    /*
    * E-->Element, Collection gibi yapılarda kullanılır.
    * K--> Key
    * V--> Number
    * N--> Type
    * S,U,V ,vb --> 2.,3, ve 4. tipler için
     */
    private T type;//field, variable
 //Getter-Setter
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
    //------------------------------

    //main Method

    public static void main(String[] args) {
        //generic yapı kullanılarak aynı classdan 2 farklı data türünde obje oluşturalım.

        GenericType<String> obj1= new GenericType<>();
        //Trick: Diamond içinde non-primitive type kullanabiliriz.
        obj1.setType("Mustafa");
        //String girmem gerekirken İnt data türünü object kısmına girince generic yapı codumu koruyarak
        // compile Time error verir aşağıdaki yoruma alınmış örnekte oluşturulmuş objectin
        // data type ile girilen değerin uyuşmadığını göreceksiniz
        /*GenericType<String> obj2= new GenericType<>();
        obj2.setType(12);*/

        //Not:



    }
}
