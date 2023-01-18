package Day01.review.basicGeneric;

public class NonGenericType {
    private Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        NonGenericType obj1=new NonGenericType();
        NonGenericType obj2=new NonGenericType();
        obj1.setO("Mirac"); // String ile set edildi.
        obj2.setO(65); //Integer ile set edildi.
        String str1 = (String) obj1.getO();//case etmek zorundayız çünkü java size object olan birşeyin hangi data type olduğunu
        // siz karar vermelisiniz der bu yüzden kararı bize bıraktığı için field'ın data type'nı belirlemek zorundayız
        // Peki biz nasıl CastException hatası alırız. örneğin obj2'yi Tırnaksız bir ifade yani Integer olarak filed'ını
        // yazdık bu yüzden Data Type'ınıda belirlerken dikkatli olmalıyız java kızmaz(Compile Time Error) ama
        // CastException hatası verir
        String str2=(String) obj2.getO();//CastException hatası verir çünkü data type yanlış.

        // BU durumlar içinde Eğer talep edilen dataType zorunluysa sizin için  O zaman;
        //String.valueOf(obj2.getO()); Integer.parseInt(obj1.getO()); gibi ifadesini kullanmak zorundayız.

    }
}
