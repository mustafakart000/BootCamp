package enumType;

public class Main {
    public static void main(String[] args) {
        useEnum(TransactionType.DEPOSIT);
        useEnum(TransactionType.WITHDRAW);
        useEnum(TransactionType.TRANSFER);
        useEnum(TransactionType.PAYMENT);



    }

    public static void useEnum(TransactionType transactionType){
        if (transactionType==TransactionType.DEPOSIT){
            System.out.println("deposit");
        }else if (transactionType==TransactionType.PAYMENT){
            System.out.println("PAYMENT".toLowerCase());
        }else if (transactionType==TransactionType.WITHDRAW){
            System.out.println("WITHDRAW".toLowerCase());
        }else if (transactionType==TransactionType.OTHER){
            System.out.println("OTHER".toLowerCase());
        }else if (transactionType==TransactionType.TRANSFER){
            System.out.println("deposit");
        }

        //Not: ENum yapıya ait methodlar
        System.out.println("Enum Name: " + transactionType.name());//
        System.out.println("Enum Coder Value: " + transactionType.getTransactionCode());// numeric değer
        System.out.println("Enum Ordinal: " + transactionType.ordinal());//
        System.out.println("Payment is "+transactionType.compareTo(TransactionType.PAYMENT));
    }
}
