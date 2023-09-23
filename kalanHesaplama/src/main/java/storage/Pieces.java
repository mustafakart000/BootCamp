package storage;

import java.util.Arrays;

public class Pieces {
    public Pieces() {
    }
    public static double saw=0.85;
    double[] orderDimensions = {
            300, 400, 32, 275.5, 132, 135.8, 370.2, 40, 603.6, 80,
            488.2, 130, 461, 125.4, 76, 102, 316.2, 92.4, 97, 94.4,
            283.8, 439.2, 97.4, 244.8, 108.4, 327.8, 86.4, 123.4,
            437.8, 101.4, 246.4, 437.8, 94.4, 246.4, 268.8, 571.2,
            295, 205.4, 541.8, 588.2, 272.8, 225.4, 171.4
    };

    int[] quantities = {
            57, 15, 21, 15, 12, 12, 3, 15, 7, 8, 8, 15, 7, 15, 8,
            8, 15, 15, 15, 15, 10, 11, 11, 8, 8, 30, 30, 7, 8, 8,
            3, 12, 12, 15, 3, 12, 15, 15, 21, 3, 12, 15, 15
    };
    int[] materialDimensions = {295, 395, 495, 595};

    int[] materialQuantities = new int[materialDimensions.length];



    public int[] getMaterialDimensions() {
        return materialDimensions;
    }

    public int[] getMaterialQuantities() {
        return materialQuantities;
    }

    public double[] getOrderDimensions() {
        return orderDimensions;
    }
    public Double[] getOrderDimensionsDouble(){
        return Arrays.stream(orderDimensions).boxed().toArray(Double[]::new);
    }


    public int[] getQuantities() {
        return quantities;
    }
    public Integer[] getQuantitiesInteger() {
        return Arrays.stream(quantities).boxed().toArray(Integer[]::new);
    }
}
