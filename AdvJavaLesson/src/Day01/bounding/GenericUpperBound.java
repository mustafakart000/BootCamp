package Day01.bounding;

public class GenericUpperBound<T extends Number> { //!!!Üstten Sınırlıyoruz Yani string gibi class'ları kısıtlıyoruz.
    private T[] numberArray;
    //constructor

    public GenericUpperBound(T[] numberArray){
        this.numberArray= numberArray;
    }


    //Array'in içindeki değerlerin ortlamasını bulan method

    public double getAvarage(){
          double sum=0;
            for (T t: numberArray){
                sum+=t.doubleValue(); // gelen bütün değerleri double tipine döndürüyor.
            }

            double avg;
            avg = sum/numberArray.length;
        return avg;

    }

    public static void main(String[] args) {
        Integer[] intArray ={2,4,7,33};


        GenericUpperBound<Integer> obj1= new GenericUpperBound<>(intArray);
        System.out.println(obj1.getAvarage());

        Double[] doubleArray ={3.2, 5.4, 7.7, 6.33};

        GenericUpperBound<Double> obj2= new GenericUpperBound<>(doubleArray);
        System.out.println(obj2.getAvarage());

        //!!! ClassCassException olmamı önlüyor
        String[] strArray = {"Java","Çok","Kolay","Generics","Tadından","Yenmez"};
      //  GenericUpperBound<String> obj3 = new GenericUpperBound<String>(strArray);
     
    }


}
