package Day02.review.Enum01;

public enum TransactionType{
    /*
     * "Sabit" yapılar kurmaya yarar.
     * enum java için bir keyword'dür
     * "==" ve "equal()" için aynı sonucu verir.
     * "new" ile yeni bir "instance" oluşturulamaz
     * Varsılayan olarak final ve static tanımlıdır.
     * Enum constructor'ları daima "private"'dır
     * */

    DEPOSIT (5),
    WITHDROW (10),
    TRANSFER (15),
    PAYMENT(20),
    OTHER (100);

    private final int transactionCode;
    private TransactionType(int code){
        this.transactionCode=code;
    }

    public int getTransactionCode() {
        return transactionCode;
    }
}
