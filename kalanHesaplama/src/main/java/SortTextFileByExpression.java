import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SortTextFileByExpression {
    public  void bufferRead(String file)  {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Dosyayı oku
            reader = new BufferedReader(new FileReader(file));

            // Verileri depolamak için bir liste oluştur
            List<String> lines = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            // Liste üzerinde sıralama işlemi
            lines.sort((line1, line2) -> {
                double expression1 = extractExpressionValue(line1);
                double expression2 = extractExpressionValue(line2);
                return Double.compare(expression1, expression2);
            });

            // Dosyanın üzerine yazmak için BufferedWriter oluştur
            writer = new BufferedWriter(new FileWriter("newCom"));

            // Sıralanmış verileri dosyaya yaz
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static double extractExpressionValue(String line) {
        int ctIndex = line.indexOf("=");
        if (ctIndex != -1) {
            String expression = line.substring(ctIndex + 1).trim();
            return Double.parseDouble(expression);
        }
        return Double.MAX_VALUE; // "CT" ifadesi bulunamadığında büyük bir değer döndürülür
    }
}