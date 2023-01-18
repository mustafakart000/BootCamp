package PracticeAdvenced.practice;

public class Q06_Arrays_belirliToplamiVerenİkililer {
    public static void main(String[] args) {
        int[] arr = {4,5,6,-10,8,5,20};
        ikileriBul(arr, 11);
    }

    public static void ikileriBul(int[] arr, int number){

        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j]==number) {

                    if (arr[i]+arr[j]==number) {
                        System.out.println(arr[i] + " "+arr[j] +"="+number);
                    }

                }
            }
        }
    }

}
