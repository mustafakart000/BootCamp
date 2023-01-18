package JavaSunctruction.day20StringBuilderStringBuffer;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append("tom Hanks");
        sb.append("tom Hanks");
        sb.append("tom Hanks");
        sb2.append("tom Hanks");

        System.out.println("sb = " + sb);

        StringBuilder strb2 = new StringBuilder();
        strb2.append("Java ");
        strb2.append("is easy");
        strb2.append("!!!");
        System.out.println("strb2 = " + strb2);
        String s1= "abc";
        String s2= new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s2.intern());





        String b = new String("JAVA");
        String a = new String("java");
        System.out.println((b = a)+b);*/

        System.out.println("Bir sayı giriniz: ");
        int n = scan.nextInt();
        printPrime(n);
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }for (int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }

        }return true;

    } public static void printPrime(int n) {
        for (int i=2; i<=n; i++){
            if (isPrime(i)) {
                System.out.println("i = " + i);
            }
        }
    }


}
