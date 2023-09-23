package chooseCorrectCombination;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TakeBetweenTwoPlus {
    public TakeBetweenTwoPlus() {
    }

    public TakeBetweenTwoPlus(String[] stroage, String[] ct, String[] twoPlus,String[] equals,String[] ctNum) {
        this.stroage = stroage;
        this.ct = ct;
        this.twoPlus = twoPlus;
        this.equals = equals;
        this.ctNum = ctNum;
    }

    String[] stroage;
    String[] ct;
    String[] ctNum;
    String[] twoPlus;
    String[] equals;


    public  TakeBetweenTwoPlus twoPlus(String combination) {
        String[] storage = combination.split(" - \\+ ");
        String[] ct = storage[1].split("\\(CT\\)\\s");
        String[] equals = storage[1].split(" =\\s");
        String[] ctNum = ct[1].split(" =");
        String[] twoPlus = ct[0].split("\\s\\+\\s");

        return new TakeBetweenTwoPlus(storage,ct,twoPlus,equals,ctNum);
    }

    public   Double[] makeGroupOrder(String combination){

        String[] twoPlus = twoPlus(combination).twoPlus;
        Double[] arr= new Double[twoPlus.length*2];
        int count=0;
        for (String plus : twoPlus) {
            String[] split = plus.split(" x ");
            for (String s : split) {

                arr[count] = Double.parseDouble(s);
                count++;
            }

        }
        return arr;

    }
    public  Double equalsAfter(String combination){
        return Double.parseDouble(twoPlus(combination).equals[1]);

    }

    public  Double storage(String combination){
        return Double.parseDouble(twoPlus(combination).stroage[0]);
    }
    public  Double ctNum(String combination){
        return Double.parseDouble(twoPlus(combination).ctNum[0]);
    }






}
