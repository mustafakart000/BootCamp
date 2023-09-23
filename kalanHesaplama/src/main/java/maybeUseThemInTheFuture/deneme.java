package maybeUseThemInTheFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deneme {

    public static List<List<Integer>> combinations(int[] array, int combinationSize) {
        List<List<Integer>> result = new ArrayList<>();
        int[] indices = new int[combinationSize];
        for (int i = 0; i < combinationSize; i++) {
            indices[i] = i;
        }
        while (true) {
            List<Integer> combination = new ArrayList<>();
            for (int index : indices) {
                combination.add(array[index]);
            }
            result.add(combination);
            int i;
            for (i = combinationSize - 1; i >= 0; i--) {
                if (indices[i] != array.length - combinationSize + i) {
                    break;
                }
            }
            if (i < 0) {
                break;
            }
            indices[i]++;
            for (int j = i + 1; j < combinationSize; j++) {
                indices[j] = indices[j - 1] + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<List<Integer>> combinations = combinations(array, 3);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
        /*int[] array = {1, 2, 3, 4, 5};
        int limit = 7;
        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {

            }
        }
        int[] array = {1, 2, 3, 4, 5};
        [1]
        [2]
        [3]
        [4]
        [1,2]
        [1,3]
        [1,4]
        [1,5]

        [1,2,3,4,5]
        [1,3,4,5]
        [1,4,5]
        [1,2,4,5]
        [1,2,4]
        [1,2,3,5]
        [1,2,3]
        [1,2,5]
        [2,3,4,5]*/


        /*ArrayList<ArrayList<Integer>> subArrays = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> subList2 = new ArrayList<>();
            for (int j = i + 1; j <= array.length; j++) {
                int[] subArray = Arrays.copyOfRange(array, i, j);
                int[] newSubArray = Arrays.copyOfRange(array,i,j);
                subList2.stream().skip(j);
                for (int f = 0; f <newSubArray.length*Math. ; f++) {
                    if (f+1==)
                }

                ArrayList<Integer> subList = new ArrayList<>();
                for (int k = 0; k < subArray.length; k++) {
                    subList.add(subArray[k]);
                }
                subArrays.add(subList);
                subArrays.add(subList2);
            }
        }
        for (ArrayList<Integer> subList : subArrays) {
            System.out.println(subList);
        }
        System.out.println("????????????????????????????????????");

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (ArrayList<Integer> subList : subArrays) {
            int sum = 0;
            for (int element : subList) {
                sum += element;
            }
            if (sum < limit) {
                result.add(subList);
            }
        }
        for (ArrayList<Integer> subList : result) {
            System.out.println(subList);
        }
*/
        System.out.println("????????????????????????????????????");



        /*int[] array = {1, 2, 3, 4, 5};
        int limit = 7;*/
//        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<ArrayList<Integer>>();

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                ArrayList<Integer> subList = new ArrayList<Integer>();
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    subList.add(array[k]);
//                    sum += array[k];
//                }
//                if (sum < limit) {
//                    subArrays.add(subList);
//                }
//            }
//        }
//
//        for (ArrayList<Integer> subList : subArrays) {
//            System.out.println(subList);
//        }
    }
}




