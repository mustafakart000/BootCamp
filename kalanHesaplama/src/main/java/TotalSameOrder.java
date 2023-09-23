import java.io.*;
import java.util.*;

public class TotalSameOrder {

        public  void bufferRead(String file)  {
            BufferedReader reader = null;
            BufferedWriter writer = null;
            System.out.println("finish");
            try {
                // Dosyayı oku
                reader = new BufferedReader(new FileReader(file));

                // Verileri depolamak için bir liste oluştur
                List<String> lines = new ArrayList<>();

                String line;
                while ((line = reader.readLine()) != null) {


                        lines.add(modifyExpression(line));

                }
                Set<String> benzersizElemanlar = new HashSet<>(lines);
                lines.clear();
               lines.addAll(benzersizElemanlar);
                // Liste üzerinde sıralama işlemi
                lines.sort((line1, line2) -> {
                    double expression1 = extractExpressionValue(line1);
                    double expression2 = extractExpressionValue(line2);
                    return Double.compare(expression1, expression2);
                });

                // Dosyanın üzerine yazmak için BufferedWriter oluştur
                writer = new BufferedWriter(new FileWriter("newComSameOrder"));

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
                    File eskiDosya2 = new File("newCom2");

                    if (eskiDosya2.exists()) {
                        if ( eskiDosya2.delete()) {
                            System.out.println("Eski dosya silindi.NewCom2");
                        } else {
                            System.out.println("Eski dosya silinemedi.NewCom2");
                        }
                    } else {
                        System.out.println("Eski dosya bulunamadı.NewCom2");
                    }
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

    public static String modifyExpression(String expression) {
        Map<String, Double> termCounts = new LinkedHashMap<>();
        String[] minius= expression.split("- \\+");

        String[] terms = minius[1].split(" \\+ ");

        for (String term : terms) {
            String[] parts = term.split(" x ");
            String coefficient = parts[0].trim();
            double multiplier;

            if (parts.length > 1) {
                multiplier = Double.parseDouble(parts[1].trim());
            } else {
                multiplier = 1.0; // Varsayılan bir değer atayabilirsiniz
            }

            if (termCounts.containsKey(coefficient)) {
                double count = termCounts.get(coefficient);
                termCounts.put(coefficient, count + multiplier);
            } else {
                termCounts.put(coefficient, multiplier);
            }
        }

        StringBuilder result = new StringBuilder();
        int count=0;
        for (Map.Entry<String, Double> entry : termCounts.entrySet()) {
            String coefficient = entry.getKey();
            double multiplier = entry.getValue();
            if (count<1){
                result.append(minius[0]).append("- + ");
                count++;
            }
            result.append(coefficient).append(" x ").append(multiplier).append(" + ");
        }
        result.delete(result.length() - 3, result.length());
        result.delete(result.lastIndexOf(" x"),result.length());
        return result.toString();
    }


}
