package PracticeAdvenced.practice.Practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice09 {

        /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     */
        Scanner scan= new Scanner(System.in);

        static List<String> dailyList= new ArrayList<>(Arrays.asList("Pazartesi", "salı", "Carsamba","Persembe", "Cuma", "Cumartesi", "Pazar"));
        static List<Double> dailySell= new ArrayList<>();
        static double sumSave=0;

//----------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 0;

        while (day < 7) {
            System.out.println(dailyList.get(day) + "Gelirini giriniz: ");
            double dailySave = input.nextDouble();
            dailySell.add(dailySave);
            sumSave += dailySave;
            day++;
        }
    }


//----------------------------------------------------------------------------------------------------------------------
        //method place
        static double incomeAverage(){
            return sumSave/dailyList.size();
        }
        static String averageUpperGain() {
            String str = "";
            for (int i = 0; i < dailySell.size(); i++) {
                if (dailySell.get(i) > incomeAverage()) {

                }
            }
        return str;}
}

    /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,

     */

    /*static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir = 0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }
        System.out.println("Gunluk Gelirler"+gunlukGelirler);
        System.out.println("Toplam Gelir = " + toplamGelir);
        System.out.println("Gelir ortalamasi: "+gelirOrtalamasi());
        System.out.println("Ortalama Ustu Gunler: "+ortalamaUstuGunler());
        System.out.println("Ortalama Alti Gunler: "+ortalamaAltiGunler());


    }

    static double gelirOrtalamasi(){
        return toplamGelir/gunler.size();
    }

    static String ortalamaUstuGunler(){
        String str="";
        for(int i=0; i<gunlukGelirler.size();i++){
            if(gunlukGelirler.get(i)>gelirOrtalamasi()){
                str += gunler.get(i)+" ";
            }
        }
        return str;
    }

    static String ortalamaAltiGunler(){
        String str="";
        for(int i=0; i<gunlukGelirler.size();i++){
            if(gunlukGelirler.get(i)<gelirOrtalamasi()){
                str += gunler.get(i)+" ";
            }
        }
        return str;
    }

}*/






