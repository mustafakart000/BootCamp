import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCombinations {

    public  void saveCombinationsToFile(double[] nums, double target, String filePath,double[] value, double[] valuesAmount,double saw) {
        List<List<Double>> combinations = getCombinations(nums, target,valuesAmount,saw);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (List<Double> combination : combinations) {
                StringBuilder line = new StringBuilder();
                line.append(target).append(" - + ");
//                writer.write(target + " - + ");
                double total=target;
                double pieces =0;
                for (int i = 0; i < combination.size(); i++) {

                     line.append((value[combination.get(i).intValue()])).append(" x ").append(valuesAmount[combination.get(i).intValue()]);
//                    writer.write( String.valueOf(value[combination.get(i).intValue()]));
//                    writer.write(" x " + valuesAmount[combination.get(i).intValue()]);
                    pieces+= valuesAmount[combination.get(i).intValue()];
                    total -= nums[combination.get(i).intValue()];

                    if (i != combination.size() - 1) {
                        line.append(" + ");
//                        writer.write(" + ");
                    }

                }
                pieces-=1;
                double remainder= total - (pieces)*saw;
                double cutThick= pieces*saw;

                if (remainder==0){
                    remainder=0;


                }
                else if ((remainder)>=saw){
                    remainder= remainder - saw;
                    cutThick+=saw;

                }else if(remainder>0){

                    cutThick+= Math.abs(remainder);
                    remainder=0.00;

                }


                if (remainder>=0){

                    writer.write(line + " + (CT) " + setScaleNumber(cutThick) + " = " + setScaleNumber(remainder) );
                    writer.newLine();

                }



            }

            System.out.println("Kombinasyonlar başarıyla dosyaya yazıldı: " + filePath);
        } catch (IOException e) {
            System.out.println("Dosyaya yazarken bir hata oluştu: " + e.getMessage());
        }

    }

    private  List<List<Double>> getCombinations(double[] nums, double target,double[] valuesAmount,double saw) {
        List<List<Double>> result = new ArrayList<>();
        List<Double> combination = new ArrayList<>();
        backtrack(nums, 0, combination, result, 0, target,valuesAmount,saw);
        return result;
    }

    private  void backtrack(double[] nums, double start, List<Double> combination,
                            List<List<Double>> result, double sum, double target,double[] valuesAmount,double saw) {
        if (sum > target) {
            return;
        }

        if (sum <= target && sum >=target-32) {
            result.add(new ArrayList<>(combination));
        }

        for (double i = start; i < nums.length; i++) {
            combination.add(i);
            sum += nums[(int) i];
            backtrack(nums, i + 1, combination, result, sum, target,valuesAmount, saw);
            combination.remove(combination.size() - 1);
            sum -= nums[(int) i];
        }
    }
    public double setScaleNumber(double setScaleNumber) {
        // İşlem yapmak istediğiniz double değeri buraya yazın
        int basamakSayisi = 5; // Noktadan sonraki basamak sayısını buraya yazın

        BigDecimal bigDecimal = new BigDecimal(setScaleNumber);
        BigDecimal sonuc = bigDecimal.setScale(basamakSayisi, RoundingMode.HALF_UP);
        return sonuc.doubleValue();
    }


}
