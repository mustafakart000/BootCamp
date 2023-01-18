package JavaSunctruction.day29abstractioncollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.asList;

public class LinkedList01 {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>(asList("A","X","M","Z","U"));
                                // "A","M","Z","U"   "A","Y","X","M","Z","U"
        //ArrayList'ler index kullanır ama index kullanmak eleman ekleme ve eleman silme işlemlerinde bize zaman kaybettirir
        //çünkü bir çok elemanın re-index edilmesi gerekir. bu sorunu çözmek için java, yeni bir yapı oluşturmuş bu yapının adı
//        adı linkList'dir her eleman iki yapıdan oluşur bu elemanların ilk bölümünde değer olur A yı koyarız B yi koyarız Sonra Z var
//        tekrar ediyorum her eleman iki yapıdan oluşur ilki data içindir ikinci bölümler ise pointer'ı gösterir. A,X'i X'M'yi
//        her biri sonrasına bağlıdır. ve pointer ile gösterilir. zaten link demek birbirine bağlanmış demektir
        //Link listler Hakkında konuşurken eleman keilmesini kullanmak yanlış değil ancak havalı olması için node kullanın
        // LinkedList' de en son node'un özel bir ismi var Tail (kuyruk )denir. pointer'ı null dur En baştakine'de Head denir
        // head olanda data kısmı yoktur pointer vardır. example  "A",( "X" Silelim ),"M","Z","U" artık linkler kırılır A'nın ve M' nin
        // pointerlar yeniden birleşir X bağlantısız kalkmış olur garbage collector gelir X'i alır götürür.
        // Eklerken Yeni Elemanı Y kabul edelim A nın Pointer'ı Y'ye bağlanır Y'nin pointer'ı ise M ye bağlanır
        // Sonuc: "A","Y","X","M","Z","U"  LinkedList eleman ekleme ve eleman silmede cok basarilidir. Bu yuzden
        // eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

        // Müzeye gelen insanlarla ilgili bir app. var giriş çıkış oluyor eleman ekleme eleman çıkarma işlemi oluyor
        // app. kaliteli olması ve hızlı olması açısından kaliteli olur.
        // bu yüzden array kullanılmaz çünkü yavaş kalır. örneğin Amazonda ve ebay gibi kuruluşlar bu yöntemi kullanarak
        // alışverişde hiçbir sorun yaşamamıştır.
        // ArrayListleri kullanmanın avatajı index kullanır adres gibidir. Link list index kullanmaz bu yüzden ilk elemana
        // sonra diğer elemana gider elemanı bulana kadar tarar burada fazla işlem yapar. 100  elemanda düşünürsek
        // tek tek çok fazla okuma yapacak bu yüzden arrayList Eleman bulma da daha başarılıdır.
        // ben bir data topluluğunda arama yapcaksam Arraylist kullanmalıyım sözlükte mesala sürekli search yapılır.
        // LinkedList Kullanırsanız  leğen de salata yapmış gibi olursunuz.
        // Demek ki arrayList çok fazla arama yapmamız gerektiği durumlarda kullancağız LinkedList'ide ekleme Çıkarma da
        //kullanırız. Mesala Amerikada Şehir isimlerini ArrayListler'e koyarsak ekleme Çıkarma az olduğu için Şehirler Hakkında
        //arama yapcağımız için ArrayListler Daha iyi Olur

        /*1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
        2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
        3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
        4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
        5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı
        durumlarda LinkedList kullanılmalıdır.
        6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
        7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini
        çok yapacaksanız ArrayList kullanmalısınız.*/
/*Eğer resim yapmada başarılı bir kişinin evine gittiğnizde resim atolyesinde herşey vardır o zaman
* LinkedList'in atolyesinde de ekleme ve çıkarma ile ilgili bir çok method vardır */
        LinkedList<String>visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        visitors.removeLast();
        System.out.println(visitors);
        visitors.removeFirst();
        System.out.println(visitors);
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");
        System.out.println(visitors);
        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);
        visitors.removeLastOccurrence("Tom Hanks");
        System.out.println(visitors);
        /*Pop() ne iş yapar öncelikle pop methodunu unutacak olursanız içine giriniz. */

        visitors.pop(); //Cut Past gibi Çalışır.

        LinkedList<String>myList = new LinkedList<>();
        //myList.pop();//NoSuchElementException atti çünkü linkedList boş.

    }
}
