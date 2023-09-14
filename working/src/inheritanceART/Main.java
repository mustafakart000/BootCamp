package inheritanceART;

public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogrt= new OgretmenKrediManager();
        ogrt.hesapla();

        System.out.println("==================================");

        KrediUI krediUI= new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
