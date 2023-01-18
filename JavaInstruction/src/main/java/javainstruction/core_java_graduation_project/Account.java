package javainstruction.core_java_graduation_project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;//hesapnumarasi
    private int pinNumber;//sifre
    private double checkingBalance; //vadesiz hesap bakiyesi
    private double savingBalance; //vadeli hesap bakiyesi
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    //hesabımda action yapcaksak orneğin para çekme yatırma gibi
    // bu yüzden method kullanmamız gerekecek.

    //paraCekmedenSonraKalanMiktar
    private double calculateCheckingBalanceAfterWitdhDraw(double amount){

        checkingBalance=checkingBalance-amount;

        return checkingBalance;
    }

    //para yatirma, para yatirma işleminden sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDeposit(double amount ){
        checkingBalance=checkingBalance+amount;
        return checkingBalance;
    }

    //para çekme: saving hesabindan para çekildikten sonra kalan bakiye

    private double calculateSavingBalanceAfterWitdhdraw(double amount){
        savingBalance=savingBalance-amount;
        return savingBalance;
    }
    //para yatirma: saving hesabina para yatirdiktan sonra geri kalan bakiye hesaplayiniz.
    private double calculateSavingBalanceAfterdeposit(double amount){
        savingBalance=savingBalance+amount;
        return savingBalance;
    }

    //instruction...give money to customer... establish a relationship with the customer
 public void getCheckinWithdraw(){
     displayCurrentAmount(checkingBalance);
     System.out.println("Cekmek istediğiniz bakiye giriniz: ");
     double amount= input.nextDouble();
     if (amount<=0) {
         System.out.println("Sıfır veya - bakiyeler geçersizdir.");
         getCheckinWithdraw(); //recursive method //methodu tekrardan cagirma
     } else if (amount <=checkingBalance) {
         calculateCheckingBalanceAfterDeposit(amount);
         displayCurrentAmount(checkingBalance);

     }else {
         System.out.println("Yetersiz bakiye");
     }
 }

 // take money from customer... establish a relationship with the customer
public void getCheckingDeposit(){
    displayCurrentAmount(checkingBalance);
    System.out.println("Yatırmak İstediğiniz Miktarı giriniz: ");
    double amount = input.nextDouble();
    if (amount<=0){
        System.out.println("Sifir veya eksi rakamlar geçersizdir ");
        getCheckingDeposit();
    }else{
        calculateCheckingBalanceAfterDeposit(amount);
        System.out.println();
        displayCurrentAmount(checkingBalance);
    }
}
 // Musteri ile para cekmek icin etkilesime gecelim: saving hesap
public void getSavingWithdraw(){
    displayCurrentAmount(savingBalance);
    System.out.println("Cekmek İstediğiniz miktarı giriniz: ");
    double amount = input.nextDouble();
    if (amount <= 0) {
        System.out.println("Sifir veya rakamlar gecersizdir.");
        getSavingWithdraw();
    } else if (amount <= savingBalance) {
        calculateSavingBalanceAfterWitdhdraw(amount);
        System.out.println();
        displayCurrentAmount(savingBalance);
    }else {
        System.out.println("Yetersiz Bakiye.");
    }
}
//Para yatirma(saving): Musteri ile para yatirmak icin etkilesime gecelim
    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatırmak istediğiniz. meblayı giriniz: ");
        double amount= input.nextDouble();
        if (amount<=0){
            System.out.println("sifir veya eksili rakamlar geçersizdir.");
            getSavingDeposit();
        }else {
            calculateSavingBalanceAfterdeposit(amount);
            displayCurrentAmount(savingBalance);

        }
    }
//son bakiye göster
    public void displayCurrentAmount(double balance){
        System.out.println("Hesabinizda bulunan bakiye: "+moneyFormat.format(balance));
    }


}
