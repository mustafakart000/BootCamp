package JavaSunctruction.day27exceptions;

import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception04 {
    public static void main(String[] args) throws IOException {
        Exception04 exception04 = new Exception04();
        textReadWithIOException();
        System.out.println();
        exception04.textRead();

    }

    public static void textRead() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\JavaSunctruction\\day27exceptions\\File2.txt");

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);


        }

    }

    public static void textReadWithIOException() throws FileNotFoundException {
        int k2 = 0;
        FileInputStream fis = new FileInputStream("src\\main\\java\\JavaSunctruction\\day27exceptions\\File2.txt");
        try {
            while ((k2 = fis.read()) != -1) {
                System.out.print((char) k2);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Belirtilen text Dosyası verilen adreste yok veya adres yanlış");

        } catch (IOException e) {
            System.out.println("text'deki dosya içeriğinde karekter uyuşmazlığı var");
        }
    }
}