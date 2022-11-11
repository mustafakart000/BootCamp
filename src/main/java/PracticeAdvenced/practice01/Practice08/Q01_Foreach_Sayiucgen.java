package PracticeAdvenced.practice01.Practice08;

public class Q01_Foreach_Sayiucgen {
    public static void main(String[] args) {
        /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */
    ucgen(6);

    }
    public static void ucgen(int a){
        char b=' ';
        for (int i=0; i<=a; i++){
            for (int j=i; j>-1;j--){
                System.out.print(b);
                System.out.print(j);
            }
            System.out.print(" ");
            System.out.println();
        }
    }
}
