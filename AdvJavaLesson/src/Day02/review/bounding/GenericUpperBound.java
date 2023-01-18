package Day02.review.bounding;

//data type'ın üst class'ını belirleme sayısal islemlerde int Integer double gibi data type'ları Number ile üst sınır
//koyabılırız
public class GenericUpperBound<T extends Number> {//üstten sınırlama

    //double, long ve  ınteger gibi sayısal data türlerini Number ile  sınırlayabiliriz ancak String ifade giremeyiz çünkü
    // String, Number'ın child class'ı değildir. amacımız gireceğimiz değer sayısal değerdir kısıtlaması koymak.

    private T[]  numberArray;

    public static void main(String[] args) {
        Integer [] intArray= {2,3,4,5};
        GenericUpperBound<Integer> obj1=new GenericUpperBound<>(intArray);

        System.out.println(obj1.getAvetage());

        Double[] doubleArray= {2.5,3.8,4.6,8.3};
        GenericUpperBound<Double> obj2= new GenericUpperBound<>(doubleArray);
        //String ile denersek çalışmayacaktır
        String[] strArray={"Java", "Çok", "Kolay","Hele","Generic","Tadından","yenmez"};
        /*GenericUpperBound<String> obj3=new GenericUpperBound<String>();//Compile time error verir bu bizi kısıtlar hatayı
        // önceden almamızı sağlar [Generic yapının bir avantajıdır.]*/

    }
    //constructor
    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }
    //array içindeki array'lerin ortalamasını bulan method:

    public Double getAvetage(){
        double sum=0;
        for (T t:numberArray){
            sum+=t.doubleValue();
        }
        double avg =sum/numberArray.length;
        return avg;
    }



    public T[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(T[] numberArray) {
        this.numberArray = numberArray;
    }

}

