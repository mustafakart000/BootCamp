package JavaSunctruction.day28Abstruction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
    "throw" ile "throws" arasindaki farklar nelerdir?
    1)"throw" method'un body'si icinde kullanilir. "throws" ise method'un isminden sonra kullanilir
    2)"throw" dan sonra object olusturulur."throws" dan sonra ise sadece Exception Class'ın ismi yazilir.
    3)"throw" method'un icinde istedigimiz yerde Exception uretmek kullanilir.
      "throws" ise var olan checked Exception'ı atmak icin kullanilir.
      "throw" Exception uretir, "throws" varolan Exception'ı atar.
    4)"throw" dan sonra sadece bir tane Exception olabilir.
      "throws" dan sonra 1 den fazla Exception olabilir.
 */
public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByline();
    }
    public static void readFileLineByline()  {
        try {
            BufferedReader br =new BufferedReader(new FileReader("src\\main\\java\\JavaSunctruction\\day27exceptions\\File1.txt"));
            String line =br.readLine();
            br.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmiş "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak Karekterler var "+e.getMessage());
        }
    }
}
