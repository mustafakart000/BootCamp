package questions.save_user_information;

public class deneme01 {
    public static int counter=0;
    static Integer a =1;

 public deneme01(){
     counter++;
     for (int i = 0; i <4;i++){
         System.out.println("constructor: "+counter++);
     }
 }
    public static void main(String[] args) {
        method01(counter);
        method02(counter);
        method02(a);
        deneme01 den01=new deneme01();//yukardaki deneme01() constructor'ı direk çalıştırır ve 1,2,3,4 yazdırır
        deneme01 den02=new deneme01();//yukardaki deneme01() constructor'ı tekrar  çalıştırır ve 6,7,8,9 yazdırır
        method01(counter);
        System.out.println("den02.method02(counter): "+den02.method02(counter));
        System.out.println("den02.method01(counter): "+den02.method01(counter));


        System.out.println(den01.counter);
        System.out.println(den02.counter);

    }


    static Integer method01(Integer a){

        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));

        return method02(a);

    }
    static Integer method02(Integer counter){
        counter++;
        System.out.println("method02:  "+counter);

        for (int i = 0; i < 4; i++){
            counter++;
            deneme01 den02=new deneme01();
            System.out.println("FOR method02:  "+den02.counter);
            den02.counter++;

        }

        return counter;
    }

}
