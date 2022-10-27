package PracticeAdvenced.practice01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_Arrays_IkinciMax {
    public static void main(String[] args) {
        int j=0;
        int arr[]={-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100,32};
        int arr2[]=new int[arr.length/2];
        Arrays.sort(arr);//[-999, -100, 1, 1, 2, 3, 5, 7, 8, 9, 22, 32]
        System.out.println(Arrays.toString(arr));
        int lenghtArr= arr.length/2;
        int k=lenghtArr*2;
        for (int i = arr.length/2; i < lenghtArr*2; i++) {
            arr2[j] += arr[i];
            j++;
        }
        for (int n = 5; n >-1; n--){
            arr[k-1]-=arr[k-1];
            arr[k-1]+=arr2[n];
            k--;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));

    }
}
