package core_java_practice.encapsulation;

public class AccountRunner {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(232323211);
        acc.setName("Frotan");
        acc.setEmail("frotan1954@gmail.com");
        acc.setAmount(234553f);
        System.out.println(acc.getName()+" "+acc.getAcc_no()+" "+ acc.getEmail()+" "+ acc.getAmount());
    }

}
