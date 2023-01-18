import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {

        /*List<Integer> myList = new ArrayList<>();
        List<Integer> listUntil13 = new ArrayList<>();
        myList.add(12);
        myList.add(11);
        myList.add(14);
        myList.add(31);
        myList.add(13);
        myList.add(165);
        myList.add(45);*/


        List<String> myList = new ArrayList<>();
        List<String> listreverse = new ArrayList<>();
        List<String> fromLesstoMore = new ArrayList<>();
        myList.add("Yellow");
        myList.add("Blue");
        myList.add("Red");
        myList.add("Green");
        listreverse.addAll(myList);
        Collections.sort(listreverse);
        for (int i=listreverse.size()-1; i>-1;i--) {
            fromLesstoMore.add(listreverse.get(i));
        }
        System.out.println(fromLesstoMore);




       /* //2.soru
        int sum=0;
        for (int w:myList) {
            if (w%2==0){
                sum+=w;
            }
        }
        System.out.println(sum);*/



       /*  //1.soru
       for (int w: myList){
                if (w==13){
                    break;
                }
                listUntil13.add(w);
        }
        System.out.println(listUntil13);*/





    }
}
