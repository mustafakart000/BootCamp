package chooseCorrectCombination;

import storage.Pieces;

import java.io.*;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class GetCombFromTxt {

   public void getCombFromTxt(String file){
       BufferedReader reader;
       BufferedWriter writer;

       Pieces pieces = new Pieces();
       double[] dimension= pieces.getOrderDimensions();
       Integer[] quantities = pieces.getQuantitiesInteger();
       try{
           TreeMap<Double, Integer> dimAndCount= new TreeMap<>(Comparator.reverseOrder());
           for (int i = 0; i <dimension.length ; i++) {
               dimAndCount.put(dimension[i],quantities[i]);
           }

            writer = new BufferedWriter(new FileWriter("choseCombination"));
           String line;
           for (Map.Entry<Double, Integer> entry : dimAndCount.entrySet()) {
               if (entry.getValue() != 0) {
                   reader = new BufferedReader(new FileReader(file));
                   // key değerini for döngüsü içinde tanımlayın
                   Double key = entry.getKey();
                   Integer value = entry.getValue();
                   while ((line = reader.readLine()) != null && value!=0) {
                       ChooseCombination chooseCom= new ChooseCombination();

                       chooseCom.chooseComb(line, dimAndCount, key);
                       if (chooseCom.getEnterIf()){

                           chooseCom.getLocalLine().forEach(t-> {
                               try {
                                   writer.write(t);
                                   writer.newLine();
                                   writer.flush();
                               } catch (IOException e) {
                                   throw new RuntimeException(e);
                               }
                           });

                       }


                   }

                   // Anahtar ve değeri yazdırabilirsiniz
                   System.out.println("Anahtar: " + key + ", Değer: " + entry.getValue());
               }
           }



           writer.write("başarıyla tamamlandı.");
           System.out.println("başarıyla tamamlandı");
           writer.close();
       }catch (IOException e){
           System.out.println("txt dosyası başarısız oldu.");
           throw new RuntimeException();

       }

    }
}
