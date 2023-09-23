import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteSameComb {
    public static void main(String[] args) {
        String dosyaYolu = "dosya.txt";
        String geciciDosyaYolu = "gecici_dosya.txt";

        try {
            // Dosyayı oku
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu));

            // Geçici dosyaya yaz
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(geciciDosyaYolu));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Satırı düzenle
                String editedLine = line.toUpperCase();

                // Düzenlenmiş satırı geçici dosyaya yaz
                bufferedWriter.write(editedLine);
                bufferedWriter.newLine();
            }

            // Kaynakları kapat
            bufferedReader.close();
            bufferedWriter.close();

            // Geçici dosyayı asıl dosyanın üzerine yaz
            FileUtil.renameFile(geciciDosyaYolu, dosyaYolu);

            System.out.println("Dosya başarıyla düzenlendi ve aynı dosya üzerine yazıldı.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileUtil {
    public static void renameFile(String eskiDosyaYolu, String yeniDosyaYolu) throws IOException {
        java.io.File eskiDosya = new java.io.File(eskiDosyaYolu);
        java.io.File yeniDosya = new java.io.File(yeniDosyaYolu);

        if (yeniDosya.exists()) {
            throw new java.io.IOException("Yeni dosya zaten var!");
        }

        if (!eskiDosya.renameTo(yeniDosya)) {
            throw new java.io.IOException("Dosya yeniden adlandırılamadı!");
        }
    }
}
