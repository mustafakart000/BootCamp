package enumType;

public enum TransactionType {


    DEPOSIT(3),
    WITHDRAW(10),
    TRANSFER(15),
    PAYMENT(20),
    OTHER(100);

    private final int transactionCode;

    TransactionType(int transactionCode) {
        this.transactionCode = transactionCode;
    }

    public int getTransactionCode(){
        return transactionCode;
    }


}
