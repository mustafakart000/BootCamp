package lf_statement_questionbank;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class lfStatement01QB {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        System.out.print("isim  giriniz: ");
//        System.out.println();
//        String i = scan.next();
//        System.out.print("soyisim giriniz: ");
//        String s = scan.next();
//        String a= i.concat(" "+s);
//
//        if (a.length()>2){
//            int b = a.charAt(0);
//            int e = a.indexOf(" ");
//            if (e != -1 ) {
//                if (a.equals(a.toUpperCase())) {
//                    System.out.println("lütfen sadece  ismin ve soyismin baş harfini büyük harf olarak yazınız.");
//
//
//                }
//                int c = a.split(" ")[1].charAt(0);
//                if (b > 64 && b < 91 && c > 64 && c < 91) {
//                    System.out.println("checked");
//            } else {
//                System.out.println("Lütfen isim ve soyismin baş harflerini büyük yazınız.");
//            }
//        }
//        }
//
//
//        if (a.replaceAll("\\s", "").replaceAll("[A-Za-z]","").length() > 0){
//            System.out.println("Lütfen isim ve soyisin giriniz bu kısmı boş bırakamazsınız .");
//        }

        /*  String[] name={"ALABAMA", "AL", "ALASKA", "AK", "ARIZONA", "AZ", "ARKANSAS", "AR", "CALIFORNIA", "CA",
                "COLORADO", "CO", "CONNECTICUT", "CT", "DELAWARE", "DE", "FLORIDA", "FL", "GEORGIA", "GA",
                "HAWAII", "HI", "IDAHO", "ID", "ILLINOIS", "IL", "INDIANA", "IN", "IOWA", "IA", "KANSAS",
                "KS", "KENTUCKY", "KY","LOUISIANA", "LA", "MAINE", "ME", "MARYLAND", "MD", "MASSACHUSETTS", "MA",
                "MICHIGAN", "MI", "MINNESOTA", "MN", "MISSISSIPPI", "MS", "MISSOURI", "MO", "MONTANA", "MT",
                "NEBRASKA", "NE", "NEVADA", "NV", "NEW HAMPSHIRE", "NH", "NEW JERSEY", "NJ", "NEW MEXICO", "NM",
                "NEW YORK", "NY", "NORTH CAROLINA", "NC", "NORTH DAKOTA", "ND", "OHIO", "OH", "OKLAHOMA", "OK",
                "OREGON", "OR", "PENNSYLVANIA", "PA", "RHODE ISLAND", "RI", "SOUTH CAROLINA", "SC",
                "SOUTH DAKOTA", "SD", "TENNESSEE", "TN", "TEXAS", "TX", "UTAH", "UT", "VERMONT", "VT", "VIRGINIA", "VA",
                "WASHINGTON", "WA", "WEST VIRGINIA", "WV", "WISCONSIN", "WI", "WYOMING", "WY"}; */
        String name2="ALABAMA AL ALASKA AK ARIZONA AZ ARKANSAS AR CALIFORNIA CA COLORADO CO CONNECTICUT CT DELAWARE DE" +
                " FLORIDA FL GEORGIA GA HAWAII HI IDAHO ID ILLINOIS IL INDIANA IN IOWA IA KANSAS KS KENTUCKY KY " +
                "LOUISIANA LA MAINE ME MARYLAND MD MASSACHUSETTS MA MICHIGAN MI MINNESOTA MN MISSISSIPPI MS " +
                "MISSOURI MO MONTANA MT NEBRASKA NE NEVADA NV NEW HAMPSHIRE NH NEW JERSEY NJ NEW MEXICO NM " +
                "NEW YORK NY NORTH CAROLINA NC NORTH DAKOTA ND OHIO OH OKLAHOMA OK OREGON OR PENNSYLVANIA PA " +
                "RHODE ISLAND RI SOUTH CAROLINA SC SOUTH DAKOTA SD TENNESSEE TN TEXAS TX UTAH UT VERMONT VT " +
                "VIRGINIA VA WASHINGTON WA WEST VIRGINIA WV WISCONSIN WI WYOMING WY";

        System.out.println(" State Name= " );
        String stateName2= scan.nextLine();
        String stateName=stateName2.trim().replaceAll("[^A-Z\\s]","");
        int nameLength= stateName.length();
        int indexStatename=name2.indexOf(stateName)+stateName.length()+1;
        System.out.println("indexStatename = " + indexStatename);
        System.out.println("nameLength = " + nameLength);

        if (!Objects.equals(stateName, stateName.toUpperCase())){
            System.out.println("Lütfen eyalet isminin Büyük harf ve doğru yazıldığına dikkat ediniz.");
        }
       else {
           String shortName= name2.substring(indexStatename,indexStatename+2);
            System.out.println("shortName = " + shortName);
        }
//  -------------------------------------------------------------------------------
//  -------------------------------------------------------------------------------
    }
}


