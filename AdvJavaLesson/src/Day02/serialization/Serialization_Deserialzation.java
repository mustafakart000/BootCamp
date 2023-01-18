package Day02.serialization;

import java.io.*;

public class Serialization_Deserialzation {

    public static void main(String[] args) {

    /*Java ile yazdığımız kodlar, data türleri ile birlikte, binary koda çevrilir. Bu kodlar arasında her değerin hangi data
 türüne sahip olduğu gibi bilgiler yer alır. Fakat oluşturduğumuz verileri, Java dışına, örneğin hard disk gibi bir
 ortama aktardığımızda yalnızca verilerin aktarılmış olmasını sağlarız. Yani hangi verinin hangi veri türüne sahip olduğu
  gibi bilgiler karşı tarafa gitmez. Bu sebeple bu verileri Java ortamına geri çağırdığımızda, sistem hangi verinin hangi
   veri türüne sahip olduğunu bilemez ve bu yüzden onları çalıştıramaz.
Bu problemin önüne geçmek için, veriler dışarıya aktarılırken, onların hangi türde olduklarını da beraberinde gönderen
 bir yapı oluşturulmuştur. Bu yapı Serialization yapısıdır. Serialization ile birlikte örneğin 5 sayısını dışarı
 aktardığınızda, yanında bu değerin Integer veri tibine sahip olduğu bilgisi de gider.
Serialization işlemi ile bu verilerin geri çağırılması ve Java diline uygun bir yapıya çevirilmesi işlemine ise
 Deserialization işlemi denir. Bu işlem, hangi verinin hangi data türüne sahip olduğunu tespit eder ve bu sayede
 onları yeniden Java diline yani Java’nın kullanabileceği hale getirir.*/

       // writeObjects();
        readObject();
    }
    //writeObject()
    private static void writeObjects(){
        System.out.println("User Objeleri Oluşturuluyor");
        User user1 = new User(1L,"Yunus", "37821332721");
        User user2 = new User(2L,"Yusuf", "98921323231");
        User user3 = new User(3L,"Betül", "68394312651");
        try(FileOutputStream fos= new FileOutputStream("user.dat")){
            try(ObjectOutputStream oos= new ObjectOutputStream(fos)) {//Objeleri yazmak için
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user3);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //readObject()
    private static void readObject(){
        //Java da File  işlemlerinde okuma işlemi yaparken
        try(FileInputStream fis = new FileInputStream("user.dat")) {//okunacak dosyayo belirledik
            try(ObjectInputStream ois= new ObjectInputStream(fis)){//Obje olarak okunacak
                User user1 =(User) ois.readObject();
                User user2 =(User) ois.readObject();
                User user3 =(User) ois.readObject();
                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//User Class'ının transfer edilebilsin diye işaretledik
class User implements Serializable{

    //private field
    private Long id;
    private String name;
    private String tcKimlikNo;

    //Constructor:

    public User(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }

    //Getter-Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }
}