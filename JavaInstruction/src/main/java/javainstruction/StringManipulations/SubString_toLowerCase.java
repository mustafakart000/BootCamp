package JavaSunctruction.StringManipulations;

import java.util.Arrays;

public class SubString_toLowerCase {
    public static void main(String[] args) {
        /*String sehirİsmi="mıAMı".toLowerCase();
        String sehirİsmiBasB = sehirİsmi.substring(0,1).toUpperCase()+sehirİsmi.substring(1);
        System.out.println(sehirİsmiBasB);*/

        /*String name1 = "Ali can";
        String name2 = "mert halil";
        String name3 = "mehmet köse";
        int name4 =(name1+name2+name3).replaceAll(" ","").length();
        System.out.println(name4);*/


        /*String s="Miami";
        int sonKrkİndex =(char)s.charAt((s.length()-1));
        int  ilkKrkİndex =(char)s.charAt(0);
        System.out.println(sonKrkİndex + ilkKrkİndex);*/
        /*String s="Java";
        int sonKrkİndex=(s.length()-1);
        String sonKrkdisindakiler = s.substring(0, sonKrkİndex).toUpperCase()+s.toLowerCase().charAt(sonKrkİndex);
        System.out.println(sonKrkdisindakiler);*/

        /*String s="diamisdasdwewdasd".toUpperCase();
        String a=s.substring(0,1).toLowerCase()+s.substring(1,s.length() - 2)+
        s.substring(s.length() - 1).toLowerCase();
        System.out.println(a);*/

        /*String s= "Tom  Hanks";
        String trimles1 = s.trim();
        String trimles2 =trimles1.replaceAll(" ","");
        boolean fark= (s.length()-trimles2.length())==1;
        System.out.println(fark);*/

        /*String s= " Tom hanks";
        String trimlenmis=s.trim();
        boolean sonuc = s.equals(trimlenmis);
        System.out.println(sonuc);*/

        //45 nokta 65 den 91 kadar.
        /*String s= "Tom hanks.";
        char ilkHarfCon= s.charAt(0);
        char sonHarfCon= s.charAt(s.length() - 1);
        boolean control= (ilkHarfCon<'Z' && ilkHarfCon>'A');
        boolean control2= (sonHarfCon==46);
        System.out.println((control==false?("ilk harf küçük"):("ilk harf büyük")));
        System.out.println(control2==true?("son harf nokta"):("son harf nokta değil") );*/


        /*String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        double gomlek$N = Double.parseDouble(gomlekFiyat.replaceAll("[$.]",""));
        double kitap$N = Double.parseDouble(kitapFiyat.replaceAll("[$.]",""));
        System.out.println((gomlek$N+kitap$N)/100);*/

        /*String s="Tom hanks";
        String harfBasSon= s.substring(0,1)+s.substring(s.length() - 1);
        System.out.println(harfBasSon);*/


        /*String s="Tom hanks";
        String bulSpace=s.substring(0,1).toUpperCase()+ s.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(bulSpace);*/

        /*String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";

        int toplamKarekterSa=s.length();
        int nokİsaretDisindakiSayisi=s. replaceAll("\\p{Punct}","").length();
        int fark=toplamKarekterSa-nokİsaretDisindakiSayisi;
        System.out.println(fark);*/

       /* int[] a= {12,5,8,13,6};
        Arrays.sort(a);//[5, 6, 8, 12, 13]
        System.out.println(Arrays.toString(a));

        int b=a.length;
        int b3=a.length/2;//5/2=2
        System.out.println("b=a.length/2: "+b);
        int b2= (a.length-1) /2;
        System.out.println("b2= (a.length-1)/2: "+b2);
        if (b%2==0){
            int i = a[((a.length-1) / 2) + 1];
            System.out.println(i);
        }
        else {
            int ortdakiEleman= (a[b3]+a[b2-1])/2;
            System.out.println();
            System.out.println(Arrays.toString(new int[]{ortdakiEleman}));
        }*/


       /* String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int minLength = b[0].length();

        for (String w : b) {
            minLength = Math.min(minLength, w.length());
        }
        for (String w : b) {
            if (minLength == w.length()) {
                System.out.println(w);

            }
        }*/


        /*int[] a = {-12, 18, -5, 23, -2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//[-12, -5, -2, 18, 23]
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;
        for (int w:a) {
            maxNumber=Math.max(maxNumber,w);
            minNumber=Math.min(minNumber, w);
        }
        System.out.println("maxNumber: "+maxNumber+" : "+"minNumber: "+minNumber);*/

        /*int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0 && a[i-1]<0){
                System.out.println(a[i]);
                System.out.println(a[i+1]);
            }
        }*/

       /* String [] b = { "Kemal", "JonathaN", "Mark", "Jackson", "Ali" };
        for (String w:b) {
            char ilkHarf= w.charAt(0);
            char sonHarf= w.charAt(w.length() - 1);
            if (w.endsWith("n")||w.endsWith("k")||w.endsWith("N")||w.endsWith("K")){
                *//*(sonHarf=='n'||sonHarf =='k'||sonHarf=='N'||sonHarf =='K')*//*
                System.out.print(" === İsim: "+w+" : "+ilkHarf);
            }
        }*/

        /*String[] b = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int kts = 0;
        for (String w:b) {
            kts+= w.length();
        }
        System.out.println(kts);*/

        // Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        /*String s = "Apex is an object oriented programming language";
        String[]arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        int say=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].substring(0,1).equalsIgnoreCase("a")||
                    arr[i].substring(0,1).equalsIgnoreCase("A")) {
                say++;
            }
        }
        System.out.println(say);*/




       /* String s = "Apex is an object oriented programming language";
        String[] arr= s.toLowerCase().split("");

        int counter=0;
        for (String w:arr) {
            switch (w){
                case "a":
                case "e":
                case "ı":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);*/



        /*String[] arr=new String[]{"alabama", "pick", "sos", "sets", "pex","alabama","alabama"};
        int size=arr.length;
        String s="alabama";
        int counter=0;
        int counter2=0;
        String al="";
        for (int i = 0; i < size; i++) {
            String ilkHarf= arr[i].substring(0,1);
            String sonHarf= arr[i].substring((arr[i].length() - 1));
            if (ilkHarf.equals(sonHarf)) {
                counter2++;
                System.out.print(" ilk ve son harf aynı olan kelimeler: "+arr[i]+ counter2+" var. ");
            } else if (counter2 ==0) {
                System.out.println("Array de yoktur");
            }
            if (s.equalsIgnoreCase(arr[i])){
                counter++;
                al+=arr[i]+" ";

            }
        }

        System.out.println("\n "+al.substring(0,al.indexOf(" "))+" Aynı obje sayısı: "+counter);*/


        /*Integer[] arr = new Integer[]{5, 0, 2, 0, 3};
        Integer[] brr = new Integer[arr.length];
        int firstIndx = 0;
        int lastIndx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[firstIndx]=arr[i];
                firstIndx++;
            }
            else {
                brr[lastIndx]=arr[i];
                lastIndx--;
            }
        }
        System.out.println(Arrays.toString(brr));*/


        /*Scanner scan= new Scanner(System.in);
        System.out.println(" Toplam kaç sayı gireceksiniz: ");
        int userListPiece=scan.nextInt();
        Integer arr[]=new Integer[userListPiece];
        int counter=0;

        int maxSayi= Integer.MAX_VALUE;
        int minSayi= Integer.MIN_VALUE;
        int enBs=0;
        int enKs=0;

        do{
            System.out.println("Bir sayi giriniz");
            arr[counter]= scan.nextInt();
            counter++;
        }while (counter!=userListPiece);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int w:arr) {
            enBs=Math.max(minSayi, w);
            enKs=Math.min(maxSayi, w);
        }
        System.out.println(enBs+" "+enKs);*/

        char [] a={'a', ' '};
        char b[]={' '};
        System.out.println(Arrays.toString(a)+Arrays.toString(b));








    }
}

