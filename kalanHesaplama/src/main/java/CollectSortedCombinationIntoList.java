
import java.io.*;
import java.util.ArrayList;


import java.util.Comparator;
import java.util.List;

public class CollectSortedCombinationIntoList {

    public void readCollectionValues(){
            String  name="combinations.txt_";
              List<String> fileLists = new ArrayList<>();
              String targetFolder = "C:\\Users\\mstf-\\Desktop\\kalanHesaplama\\";
              File folder = new File(targetFolder);
              if (folder.isDirectory()) {
                    File[] files = folder.listFiles();
                   if (files!=null){
                       for (File file : files){
                           if (file.isFile() && file.getName().startsWith(name)) {
                               fileLists.add(file.getName());
                           }
                       }

                       }
                   }
        String targetFile="collectAllFiles";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
            for (String w: fileLists) {

                    List<String> srt=sortValuesFromFile(w);
                for (String k: srt) {
                    writer.write(k);
                    writer.newLine();
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public  List<String> sortValuesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
//

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.contains(" = ")) {
                    continue; // Boş satırı veya geçersiz satırı atla
                }
                lines.add(line);

            }

            lines.sort(Comparator.comparingDouble(line2 -> {
                String[] parts = (line2).split(" = ");
                return parseValueFromLine(parts[parts.length - 1].trim());
            }));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    private double parseValueFromLine(String line) {
        String[] parts = line.split(" = ");
        String valueStr = parts[parts.length - 1].trim();
        return Double.parseDouble(valueStr);
    }





    }



