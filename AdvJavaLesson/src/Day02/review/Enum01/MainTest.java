package Day02.review.Enum01;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(TransactionType.DEPOSIT.getTransactionCode());
        System.out.println(TransactionTypeConstant.PAYMENT);
        System.out.println("useConstantMethod(i:)");
        useConstantMethod(1);
        useConstantMethod(2);
        useConstantMethod(3);
        useConstantMethod(4);
        useConstantMethod(100);
        useConstantMethod(5);

        System.out.println("===========================================");
        System.out.println("useEnumMethod");
        useEnumMethod(TransactionType.OTHER);
        useEnumMethod(TransactionType.WITHDROW);
        useEnumMethod(TransactionType.DEPOSIT);
        useEnumMethod(TransactionType.PAYMENT);
        useEnumMethod(TransactionType.TRANSFER);


    }

    //Eski tarz Enumsuz yapı

    private static void useConstantMethod(int i){
        if (i==TransactionTypeConstant.DEPOSIT){
            System.out.println(TransactionTypeConstant.DEPOSIT);
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println(TransactionTypeConstant.WITHDRAW);
        } else if (i==TransactionTypeConstant.TRANSFER) {
            System.out.println(TransactionTypeConstant.TRANSFER);
        }else if (i==TransactionTypeConstant.PAYMENT){
            System.out.println(TransactionTypeConstant.PAYMENT);
        } else if (i==TransactionTypeConstant.OTHER) {
            System.out.println(TransactionTypeConstant.OTHER);
        }
    }
    //Enum yapıyla
    private static void useEnumMethod(TransactionType transactionType){
        if (transactionType==TransactionType.OTHER){
            System.out.println("OTHER METHODS");
        }else if (transactionType==TransactionType.DEPOSIT){
            System.out.println("money is depositing");
        }else if (transactionType==TransactionType.TRANSFER){
            System.out.println("money is Transfering");
        }else if (transactionType==TransactionType.PAYMENT){
            System.out.println("payment is making");
        }else if (transactionType==TransactionType.WITHDROW){
            System.out.println("take money");
        }

    }
}
