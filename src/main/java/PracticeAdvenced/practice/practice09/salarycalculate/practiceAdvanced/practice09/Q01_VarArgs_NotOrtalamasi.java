package PracticeAdvenced.practice.practice09.salarycalculate.practiceAdvanced.practice09;

public class Q01_VarArgs_NotOrtalamasi {
    //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan
    //	bir method yazınız.
    public static void main(String[] args) {
        ortlamaHesapla("Hakkı",8,9,3,4);
        ortlamaHesapla("meltem",4,4,5,3);
        ortlamaHesapla("can",3,3,2,4);
        ortlamaHesapla("abdullah",5,5,2,8);

    }
    public static void ortlamaHesapla(String name, double...not){
        double toplam =0;
        for(double w: not){
            toplam+=w;
        }
        System.out.println(name+"'nin not ortalaması: "+String.format("%.2f",toplam/not.length));
    }
}
