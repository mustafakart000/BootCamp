package PracticeAdvenced.practice.Practice08;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketWeeklyGain {
    static double sum=0;
    static double dailyAvaregeDivide=0;
    static List<String> daysOfWeek= new ArrayList<>(Arrays.asList("Monday","tuesday","wednesday","thursday",
            "friday","saturday","sunday"));
    static List<Double> amountsDaysOfWeek = new ArrayList<>();
    public static void main(String[] args) {
         /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,

     */

    daliyAvarage();
    highlyDailyAvarage();
    lowestDailyAvarage();

    }

    public static double weeklyGain(){
        Scanner scan=new Scanner(System.in);
        for (String w:daysOfWeek){
            double userGain= scan.nextDouble();
            System.out.println(Integer.valueOf(daysOfWeek.indexOf(w)+1)+"."+w+" Gain: "+userGain);
            sum+=userGain;
            amountsDaysOfWeek.add(userGain);
        }
        String totalWeeklyGain= "total weekly gain: "+sum;
        System.out.println(totalWeeklyGain+" : "+ " " + amountsDaysOfWeek);

        return sum;
    }
    public static double daliyAvarage(){
        dailyAvaregeDivide=sum/Integer.valueOf(daysOfWeek.size());
        System.out.println("daily Gaid Avarege: "+dailyAvaregeDivide);
        return dailyAvaregeDivide;
    }
    public static List<Double> highlyDailyAvarage(){
        List<Double> highlyDailyAva=new ArrayList<Double>();

        for (double w:amountsDaysOfWeek) {
            if (w>=dailyAvaregeDivide) {
                highlyDailyAva.add(Math.max(dailyAvaregeDivide, w));
            }
        }
        System.out.println("Highly Daily Avarage: "+highlyDailyAva);

        return highlyDailyAva;
    }

    public static List<Double> lowestDailyAvarage() {

        List<Double> lowestDailyAva = new ArrayList<Double>();
        for (double w : amountsDaysOfWeek) {
            if (w < dailyAvaregeDivide) {
                lowestDailyAva.add(Math.min(dailyAvaregeDivide, w));
            }
        }

        System.out.println("Lowest Daily Avarage: " + lowestDailyAva);
        return lowestDailyAva;
    }


}
