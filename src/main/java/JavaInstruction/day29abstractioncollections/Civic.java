package JavaSunctruction.day29abstractioncollections;
/*
* Abstract method'lar sadece ne yapılacağını söylerler.
* Concrete method'lar ne yapilacağı ile birlikte nasıl yapılacağıı(how to do) da söyler
* "interface" 'ler bir yapilacaklar isler listedir (to do list)


    "abstract method"lar sadece NE yapılacağını(WHAT TO DO) söyler
    "concrete method"lar ne yapılacağı ile birlikte NASIL yapılacağını(HOW TO DO) da söyler

    "interface"ler bir yapılacak işler listesidir.(TO DO LIST)

    "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu method'ların
    return type'ları aynı olmalıdır. Aksi takdirde hata verir.

    "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
    "abstract class" lar class oldukları için constructor vardır. Ama constructor'lar abstract class'larda object oluşturamazlar.

     Child ----- Parent
 Class ----> Interface     ==> implements
 Class ----> Class         ==> extends
 Interface ----> Interface ==> extends
 Interface ----> Class     ==> Impossible

 */
public class Civic implements Engine, Ac{
    @Override
    public void run() {

    }

}
