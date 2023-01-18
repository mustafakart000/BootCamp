package Day02.enumType;

public class MainTest {
    public static void main(String[] args) {
        //eski Tarz
    useConstantMethod(1);
    useConstantMethod(2);
    useConstantMethod(3);
    useConstantMethod(4);
    useConstantMethod(100);

//    enum

        useEnumMethod(TransactionType.DEPOSIT);
        useEnumMethod(TransactionType.PAYMENT);
        useEnumMethod(TransactionType.WITHDRAW);
        useEnumMethod(TransactionType.OTHER);
        useEnumMethod(TransactionType.TRANSFER);
    }

    //eski tarz
    //Eğer i=1,2,3,4 ve 100'ün dışında bir değer girersek boş döner ve bu yüzden enum kullanırız
    //bizi ne kullanacağımız konusunda kısıtlayacaktır.
    private static void useConstantMethod(int i){
        if (i==TransactionTypeConstant.DEPOSIT){
            System.out.println("money is deppositing");
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withDrawing");
        } else if (i==TransactionTypeConstant.OTHER) {
            System.out.println("Money is transaction");
        } else if (i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is made");
        }else if (i==TransactionTypeConstant.TRANSFER) {
            System.out.println("Money is Transfering");
        }
    }

    //enum Yapıyla

    private static void useEnumMethod(TransactionType transactionType){
        if (transactionType==TransactionType.DEPOSIT){
            System.out.println("money is deppositing");
        } else if (transactionType==TransactionType.WITHDRAW) {
        System.out.println("Money is withDrawing");
    } else if (transactionType==TransactionType.OTHER) {
        System.out.println("Money is transaction");
    } else if (transactionType==TransactionType.PAYMENT) {
        System.out.println("Money is made");
    }else if (transactionType==TransactionType.TRANSFER) {
        System.out.println("Money is Transfering");
    }


        //NOt: Enum Yapıya Has methodlar.

        System.out.println("Enum Name : " +transactionType.name() ); //Enum ismini ekrana yazdım.


    }


}
