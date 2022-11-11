package PracticeAdvenced.practice01.Practice08;

public class Practice11 {
    public static void main(String[] args) {

        String str="Java is so good";
        for (int i=0; i<str.length();i++) {
            for (int j =0; j <str.length(); j++) {
                boolean d = str.substring(i,i+1).equals(str.substring(j,j+1));
                if (d == true && i!=j ) {
                    System.out.println(" "+str.charAt(i)+ " : " +str.charAt(j));
                    str=str.replaceAll(String.valueOf(str.charAt(i)), "");
                    }
                }
        }
        System.out.println(str);

    }
}
