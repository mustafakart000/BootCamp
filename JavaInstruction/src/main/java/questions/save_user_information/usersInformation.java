package questions.save_user_information;

import java.util.*;

public class usersInformation {
     static usersInformation u2=new  usersInformation();
     static HashMap<Integer,String> getUserInfo=new HashMap<>();
     static Integer selectEnter=0;
   public usersInformation() {
      getUserInfo.put(saveInfo(), getList().toString());

   }
    public static void main(String[] args) {
        callmethod();
    }
    static Integer callmethod(){
        while (selectEnter!=3) {
            System.out.println("kimlik kayıt için: 1, kayıtlı kimik silmek için: 2, çıkmak için yanlızca 3 yazınız: ");
            Scanner scanner = new Scanner(System.in);
            Integer selectEnter = scanner.nextInt();
            if (selectEnter == 1) {
                saveInfo();
                callmethod();
            } else if (selectEnter==2) {
                System.out.println("dene");

            } else if (selectEnter == 3) {
                break;
            }
        }
        return selectEnter;
    }

        static Integer saveInfo(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen Dört haneli kimlik nurası giriniz: ");
            Integer identy= scan.nextInt();
            getList();
            return identy;
        }
        static String[] getList(){
            Scanner scan=new Scanner(System.in);
            String[] personAllİnfo=new String[3];
            for (int i=0; i<3; i++){
                String[] personRaw= {"Ad","adres","telefon" };
                System.out.println("Lütfen bir "+personRaw[i]+" giriniz: ");
                personAllİnfo[i]=scan.next();
            }

            return personAllİnfo;

        }

}
