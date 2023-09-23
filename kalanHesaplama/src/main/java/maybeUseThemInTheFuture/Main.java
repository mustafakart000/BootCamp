package maybeUseThemInTheFuture;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double[] array = {300, 400, 32, 275.5, 132, 135.8, 370.2, 40, 603.6, 80,
                488.2, 130, 461, 125.4, 76, 102, 316.2, 92.4, 97, 94.4,
                283.8, 439.2, 97.4, 244.8, 108.4, 327.8, 86.4, 123.4,
                437.8, 101.4, 246.4, 437.8, 94.4, 246.4, 268.8, 571.2,
                295, 205.4, 541.8, 588.2, 272.8, 225.4, 171.4};

        List<List<Double>> combinations = new ArrayList<>();

        for (int i = 1; i <= array.length; i++) {
            combinations.addAll(combination(array, i));
        }

        System.out.println(combinations);
    }

    private static List<List<Double>> combination(double[] array, int length) {
        List<List<Double>> result = new ArrayList<>();
        combinationHelper(array, length, 0, new ArrayList<>(), result);
        return result;
    }

    private static void combinationHelper(double[] array, int length, int start, List<Double> current, List<List<Double>> result) {
        if (current.size() == length) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = start; i < array.length; i++) {
                current.add(array[i]);
                combinationHelper(array, length, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}

