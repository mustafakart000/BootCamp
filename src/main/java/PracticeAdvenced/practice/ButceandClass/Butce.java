package PracticeAdvenced.practice.ButceandClass;

public class Butce {
    public static int butce; // static
    public int harclik; //başkasının cebini değil harcayının cebini etkeleyecek olur bu yüzden static yapmayız
    public void harclikAl(int alinanHarclik){
        harclik += alinanHarclik;
        butce-=alinanHarclik;
    }
    public void butcedenHarca(int harcanacakPara){
        butce-= harcanacakPara;
    }
    public void harclikHarca(int harclikHarcamasi){
        harclik-= harclikHarcamasi;
    }
    public void maasAl(int alinanMaas){
        butce+=alinanMaas;
    }
}
