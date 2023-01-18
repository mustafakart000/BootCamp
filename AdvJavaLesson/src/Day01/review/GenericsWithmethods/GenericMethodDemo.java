package Day01.review.GenericsWithmethods;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethodDemo   obj1= new GenericMethodDemo();
        Integer[] intArray={1,2,3,4,5,6};
        Double[] doubleArray={4.2,5.3,6.4,7.9,8.1};
        obj1.print(intArray);
        obj1.print(doubleArray);
        //ilkel ve uzun bir yöntem biz methodlarımızı generic yaparsak iki ayrı data türünde
        //method oluşturmammıza gerek kalmaz şimdi generic bir method ile deneyelim
        obj1.print(intArray);
    }
    public void print(Integer[] arr){
        //****
    }
    public void print(Double[] arr1){

    }
    public <T> void print (T[] array){
        for (T t: array){
            System.out.println(t);
        }
    }
}
