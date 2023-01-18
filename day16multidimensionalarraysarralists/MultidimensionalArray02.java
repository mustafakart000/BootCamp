package day16multidimensionalarraysarralists;

public class MultidimensionalArray02 {
    public static void main(String[] args) {

        int arr[][] = { {2, 5, 1}, {83, 75} };
        int maxElement =arr[0][0];
        int minElement =arr[0][0];
        for (int[] w:arr){

            for (int k:w){
                maxElement=Math.max(maxElement,k);
                minElement=Math.min(minElement,k);
            }
        }
        System.out.println("maxElement = " + maxElement);
        System.out.println("minElement = " + minElement);

    }
}
