package JavaSunctruction.practice_bootCamp;

public class Q06_Static_Butce_Runner {

    public static void main(String[] args) {
        //Basit bir ev bütçesi kodu yazınız.



            Butce baba = new Butce();
            System.out.println("Maas oncesi: " + Butce.butce);
            baba.maasAl(5000);
            System.out.println("Maas sonrasi butce: " + Butce.butce);
            System.out.println(baba.harclik);
            baba.harclikAl(500);

            baba.harclikHarca(266);
            baba.butcedenHarca(1000);
            baba.butcedenHarca(5000);

            System.out.println("Baba harclik: " + baba.harclik);

            Butce anne = new Butce();
            anne.maasAl(2000);
            anne.maasAl(3000);
            anne.harclikAl(2000);
            anne.harclikHarca(300);

            Butce kiz = new Butce();
            kiz.harclikAl(500);
            kiz.harclikHarca(400);

            System.out.println("Butce: " + Butce.butce);//
            System.out.println("Harclik: " + kiz.harclik);//

        }


    }

