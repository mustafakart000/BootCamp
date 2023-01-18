package Day02.review.serialization;

import java.io.*;

public class SerializationDeSerialization {



    public static void main(String[] args) {
//    writeObjects();
    readObjects();


    }
    //writeObject() Serialization
    private static void writeObjects(){
        System.out.println("User objeleri oluşturuyor.");//buradaki oluşacak obhjeler durduruldugu an hepsi silinecektir
        //bu yüzden geçici ram den silinmeden önce aşağıdaki komutlar yardımıyla bu objeleri data base veya harddiske
        //kaydedebiliriz ne amaç ile kullanılır ? Xml web servislerinde istemci taleplerinie göndericelecek olan objelerin,
        //network üzerinden taşıyacağımız paketlerin veya bir web sayfasında yer alan session objectlerin veritabanında
        //saklanması sırasında biz bu yapıyı kullanırız
        User user1= new User(1L, "yunus",  "12894389322");
        User user2= new User(2L, "ahmet",  "12994389322");
        User user3= new User(3L, "mehmet", "13094389322");
        try(FileOutputStream fileOutputStream=new FileOutputStream("User.dat")) {// dosyaları yazdırmak için
            try (ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream)){//Objeleri yazdırmak için
                objectOutputStream.writeObject(user1);
                objectOutputStream.writeObject(user2);
                objectOutputStream.writeObject(user3);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //readObjest Deserialization
    private static void readObjects(){
        //Java da File işlemlerinde okuma yaparken işlemi yaparken FileInputStream class'ı kullanılır.
        try (FileInputStream fileInputStream =new FileInputStream("User.dat")){
            try(ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){
                User user1=(User) objectInputStream.readObject();
                User user2=(User) objectInputStream.readObject();
                User user3=(User) objectInputStream.readObject();
                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//USer Clasını transfer edilebilsin diye işaretledik
class User implements Serializable{
    private Long id;
    private String name;
    private String tcKimlikNo;
    //constructor

    public User(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }

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

    //toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }

}
