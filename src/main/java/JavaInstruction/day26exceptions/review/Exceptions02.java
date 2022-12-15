package JavaSunctruction.day26exceptions.review;

public class Exceptions02 {
    public static void main(String[] args) {
        String arr[]={"ali","can","veli","Aslı"};
        getElementFromArray(arr, 2);
        getElementFromArray(arr, 0);
        getElementFromArray(arr, 4);

    }
    public static void getElementFromArray(String arr[], int idx ){
        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            //Bu benim teknik olmayan açıklamam
            System.out.println("Array de index'te bir program meydana geldi   "+ e.getMessage());
            System.err.println("Hata mesajını diğer mesajlardan ayırmak için System.err.println kullanırız. ");
        }
    }
}

