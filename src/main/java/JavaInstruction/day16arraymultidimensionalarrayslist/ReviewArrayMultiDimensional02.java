package JavaSunctruction.day16arraymultidimensionalarrayslist;

public class ReviewArrayMultiDimensional02 {
    public static void main(String[] args) {

        //Bir multidimensional array deki en buyuk ve en kucuk elmanin toplamını veren kodu yazınız

        int arr[][]={{2, 5, 1}, {32, 75}};
        int maxElement = arr[0][0];
        int minElement = arr[0][0];
        for (int[] w:arr) {
            for ( int k: w){
                maxElement = Math.max(maxElement,k);
                minElement = Math.min(minElement,k);
            }
        }

        System.out.println("maxElement: " + maxElement + " minElement: " + minElement);
        System.out.println("maxElement+minElement= "+(maxElement+minElement));



    }
}
