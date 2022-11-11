package PracticeAdvenced.practice01.Practice06.Again;

public class Array_Simetrik {
    public static void main(String[] args) {
        //Bir Array'in simetrik olup olmadığını kontrol eden bir method yazınız.
        int[] arr ={1,2,3,4,5,6,7,6,5,4,3,2,1,4};
        System.out.println("Array Simetrik mi ? "+simetrik(arr));
    }
    public static boolean simetrik(int[] arr){
       boolean sonuc =true;
       for (int i = 0; i < arr.length; i++){
           if (arr[i] != arr[arr.length - 1-i] ) {
               System.out.println("Array List simetrik değildir. ");
               sonuc= false;
               break;
           }
        }
       ;
       return sonuc;
    }
}
