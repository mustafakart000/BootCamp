import storage.Pieces;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CalculateGroupAsDimensions {




    public CalculateGroupAsDimensions() {
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }
    private  List<Double> keyList;
    private  List<Double> valueList;
    private  List<Double> valueListCount;
    private  List<Double> valueListCountMulti;
    private  List<Double> storageSingle;

    List<Double> orderAndCount = new ArrayList<>();
    List<Double> orderAndCount1 = new ArrayList<>();
    List<Double> getOrderAndCountMultiple = new ArrayList<>();
    Pieces pieces = new Pieces();
    int[] storage = pieces.getMaterialDimensions();


    public void designIndexes(){
        ArrayCombinations combine = new ArrayCombinations();
        CalculateCombinationAsDimension calculateCombinationAsDimension = new CalculateCombinationAsDimension();
        List<Double> order= calculateCombinationAsDimension.orderDimension().getOrderRem();
        double saw =Pieces.saw;
        SameNumber sameNumber = new SameNumber();

        int count2=0;
        DecimalFormat df = new DecimalFormat("0,00");
        for (int k : storage) {
            keyList = new ArrayList<>();
            valueList = new ArrayList<>();
            valueListCount = new ArrayList<>();
            valueListCountMulti = new ArrayList<>();
            storageSingle=  new ArrayList<>();
            Double compare = 0.d;
            int count=0;
            orderAndCount= new ArrayList<>();
            orderAndCount1 = new ArrayList<>();
            getOrderAndCountMultiple = new ArrayList<>();
            for (int j = count2; j < order.size(); j +=4) {
                if (k == order.get(count2)) {
                    compare = order.get(count2);
                    orderAndCount.add(order.get(count2 +1));
                    orderAndCount1.add(order.get(count2 + 2));
                    getOrderAndCountMultiple.add(order.get(count2 + 1)*order.get(count2 + 2));
                    count++;
                    count2+=4;
                }
            }

            if (k == compare) {
                storageSingle.add((double) k);

            }

            keyList.add((double) k);
            keyList.add((double) count);

            sameNumber.removeSameNumber(orderAndCount, orderAndCount1, getOrderAndCountMultiple);
            valueList.addAll(orderAndCount);
            valueListCount.addAll(orderAndCount1);
            valueListCountMulti.addAll(getOrderAndCountMultiple);
            double[] nums= valueListCountMulti.stream().mapToDouble(Double::doubleValue).toArray();
            double[] values= valueList.stream().mapToDouble(Double::doubleValue).toArray();
            double[] valuesAmount= valueListCount.stream().mapToDouble(Double::doubleValue).toArray();

            String filePath = "combinations.txt_" + k;
           combine.saveCombinationsToFile(nums, k, filePath,values,valuesAmount,saw);

        }


    }
    public double setScaleNumber(double setScaleNumber) {
        // İşlem yapmak istediğiniz double değeri buraya yazın
        int basamakSayisi = 2; // Noktadan sonraki basamak sayısını buraya yazın

        BigDecimal bigDecimal = new BigDecimal(setScaleNumber);
        BigDecimal sonuc = bigDecimal.setScale(basamakSayisi, RoundingMode.HALF_UP);
        return sonuc.doubleValue();
    }

}
