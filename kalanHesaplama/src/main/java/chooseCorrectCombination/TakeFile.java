package chooseCorrectCombination;

import java.io.*;
import java.util.*;

public class TakeFile {

        public void bufferReader(String file){
            BufferedReader reader;
            BufferedWriter writer;
            try {
                reader =new BufferedReader(new FileReader(file));
                writer = new BufferedWriter(new FileWriter("SortCuttingThickness"));
                TakeBetweenTwoPlus takeBetweenTwoPlus= new TakeBetweenTwoPlus();

                    List<String> lines =new ArrayList<>();
                    String line;

                        while ((line=reader.readLine())!=null){
                            lines.add(line);


                        }

                lines.sort((line1, line2) -> {

                    double expression1 = takeBetweenTwoPlus.ctNum(line1) + takeBetweenTwoPlus.equalsAfter(line1);
                    double expression2 = takeBetweenTwoPlus.ctNum(line2) + takeBetweenTwoPlus.equalsAfter(line2);

                    return Double.compare(expression1, expression2);

                });
                for (String sorted : lines) {
//                    System.out.println(lines);
                    try {
                        writer.write(sorted);
                        writer.newLine();
                        writer.flush(); // Tamponu disk üzerine yaz
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                writer.close(); // Writer'ı kapat (kaynakları serbest bırak)


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


}
