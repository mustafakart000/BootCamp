/*
import java.io.*;
import java.util.*;

public class TxtFileDesign {

    public  void sortedNumbers(String filePath, double target) {

        List<String> sortedValues = sortValuesFromFile(filePath);

        if (sortedValues != null) {
            writeSortedValuesToFile("C:\\Users\\mstf-\\Desktop\\kalanHesaplama\\sorted_Order_"+ target, sortedValues);
            System.out.println("Sorted values have been written to the file.");
        } else {
            System.out.println("An error occurred while sorting the values.");
        }
    }

    public  List<String> sortValuesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();

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


    public  void writeSortedValuesToFile(String filePath, List<String> sortedLines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : sortedLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
