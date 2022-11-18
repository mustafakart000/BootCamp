package JavaSunctruction.practice_bootCamp;

public class Butce {

    public static int butce;
    public int harclik;

    public void  harclikAl(int alinanHarclik){
        harclik += alinanHarclik;
        butce -= alinanHarclik;
    }

    public void butcedenHarca(int harcanacakPara){
        butce -= harcanacakPara;
    }

    public void harclikHarca(int harclikHarcamasi){
        harclik -=harclikHarcamasi;
    }

    public void maasAl(int alinanMaas){
        butce += alinanMaas;
    }
}
