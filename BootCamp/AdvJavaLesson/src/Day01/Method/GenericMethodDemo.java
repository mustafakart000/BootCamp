package Day01.Method;

public class GenericMethodDemo {
    //Generic methodlar hangi durumda bize kolaylık sağlıyor.

    public static void main(String[] args) {
        GenericMethodDemo obj1 = new GenericMethodDemo();
        Integer[] intArray= {1,23,54,56,45};
        Double[]  doubleArray={1.2, 3.4, 4.2};
            obj1.print(intArray);
            obj1.print(doubleArray);

        }

    public void print(Integer[] arr){

    }
    public void print(Double[] arr){

    }

    //Generic method
    public <T> void print(T[] array){
        for (T t:array) {
            System.out.println(t);
        }
    }
}
