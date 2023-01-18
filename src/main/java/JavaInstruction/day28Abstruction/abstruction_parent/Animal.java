package JavaSunctruction.day28Abstruction.abstruction_parent;

public abstract class Animal {
    //body'si olmayan method'lar "abstract method" olarak adlandirilir
    //Bir method'u abstract yapmak icin; i)Method body'i sil  ii)"abstract" keuword kullan
    //"abstract method" lar "abstract class" icinde olmalidir.
    abstract void eat();
    //"abstract class" larda hem "abstract" hem de "concrete"(non-abstract) method kullanilabilir.
    void drink(){
        System.out.println("Animal drink");
    }
    //abstract "move" method olusturunuz

    abstract void move();

}
