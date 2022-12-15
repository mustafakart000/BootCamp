package PracticeAdvenced.practice.ButceandClass;

public class Butce_Runner {
    public static void main(String[] args) {
        Butce baba= new Butce();
        System.out.println("Butce.butce öncesi "+Butce.butce);
        baba.maasAl(5000);
        System.out.println("baba.butce sonra "+baba.butce);
        System.out.println("Butce.butce sonrası "+Butce.butce);
        baba.maasAl(-400);
        System.out.println("-400 maas al");
        System.out.println("baba.butce sonra "+baba.butce);
        System.out.println("Butce.butce sonrası "+Butce.butce);
        baba.butcedenHarca(300);
        System.out.println("baba.butcedenHarca sonrası harclık "+baba.harclik);
        System.out.println("baba.butce sonra "+baba.butce);
        System.out.println("Butce.butce sonrası "+Butce.butce);
        baba.harclikHarca(100);
        baba.harclikAl(700);
        System.out.println("baba.harclik sonrası "+baba.harclik);
        Butce anne= new Butce();
        anne.harclikAl(600);
        baba.harclikHarca(200);
        anne.harclikHarca(100);
        System.out.println("baba.harclik harcama sonrası "+baba.harclik);
        System.out.println("Butce.butce sonrası "+Butce.butce);
        System.out.println("anne.harclik harcama sonrası "+anne.harclik);
        System.out.println("baba.harclik harcama sonrası "+baba.harclik);



    }
}
