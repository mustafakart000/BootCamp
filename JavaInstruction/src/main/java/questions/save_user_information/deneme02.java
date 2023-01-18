package questions.save_user_information;

import java.util.Arrays;
import java.util.HashMap;


public class deneme02 {
    static HashMap<String, String> addExamples = new HashMap<>();
    static Integer counter = 0;

    public static void main(String[] args) {
        deneme02 deneme=new deneme02();
        System.out.println();

    }

    static void deneme02() {
        System.out.println(addExamples.put(addKeys(), addValues()));
        System.out.println("1");
        if (counter > 4) {
            System.out.println(addExamples);
            System.out.println("2");
        }
        deneme02.counter++;
    }

    static String addKeys() {
        System.out.println("3");
        String[] arrKeys = new String[]{"1", "2", "3", "4", "5"};
        return arrKeys[counter];
    }

    static String addValues() {
        System.out.println("4");
        String[] arrValu = {"6", "7", "8", "9", "0"};
        return arrValu[counter];
    }



}


