package core_java_practice.encapsulation;

public class CreditCardRunner {
    public static void main(String[] args) {
        CreditCard cd= new CreditCard();
        System.out.println(cd.getAge());
        System.out.println(cd.getCcn());
        System.out.println(cd.isExpired());
        System.out.println("=======================");
        cd.setCcn("------------1212");//************1212
        System.out.println(cd.getCcn());
        String ccn=cd.getCcn();
        cd.setCcn("************"+ccn.substring(ccn.length()-4));
        System.out.println(cd.getCcn());
        CreditCard cd2 = new CreditCard();
        System.out.println(cd2.getCcn());
        cd.setAge(60);
        System.out.println(cd.getAge());
        cd.setExpired(true);
        System.out.println(cd.isExpired());
    }

}
