import storage.Pieces;

import java.util.ArrayList;
import java.util.List;


class CalculateCombinationAsDimension {
    public CalculateCombinationAsDimension() {
    }

    CalculateCombinationAsDimension(Double[] storageRem, List<Double> orderRem){
        this.storageRem=storageRem;
        this.orderRem = orderRem;
    }

    Pieces pieces= new Pieces();
    int[] storage = pieces.getMaterialDimensions();

    double[] orderDim= pieces.getOrderDimensions();
    Double[] storageRem=null;

    List<Double>orderRem=null;
    List<Double>order=new ArrayList<>();

    public CalculateCombinationAsDimension orderDimension() {


        List<Double>orderRem;
        storageRem = new Double[storage.length];
        for (int i = 0; i <storage.length ; i++) {
            orderRem = new ArrayList<>();
            for (int j = 0; j <orderDim.length; j++) {
                int count =1;

                while ( storage[i]>= orderDim[j] * count + Pieces.saw*(count-1) ) {
                   orderRem.add((double) storage[i]);
                   orderRem.add(orderDim[j]);
                   orderRem.add((double)count);
                   orderRem.add(storage[i]-orderDim[j]*count);
                   count++;

                }

                storageRem[i] = (double) storage[i];

            }
            order.addAll(orderRem);

        }
        return new CalculateCombinationAsDimension(storageRem, new ArrayList<>(order));
    }

    public List<Double> getOrderRem() {
        return orderRem;
    }



}