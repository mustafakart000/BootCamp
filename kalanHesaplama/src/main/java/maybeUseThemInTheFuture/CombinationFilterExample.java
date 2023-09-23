package maybeUseThemInTheFuture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class CombinationFilterExample {
    public static void main(String[] args) {
        double[] elements = {300, 400, 32, 275.5, 132, 135.8, 370.2, 40, 603.6, 80,
                488.2, 130, 461, 125.4, 76, 102, 316.2, 92.4, 97, 94.4,
                283.8, 439.2, 97.4, 244.8, 108.4, 327.8, 86.4, 123.4,
                437.8, 101.4, 246.4, 437.8, 94.4, 246.4, 268.8, 571.2,
                295, 205.4, 541.8, 588.2, 272.8, 225.4, 171.4};

        double targetSum = 595; // Hedef toplam

        for (int r = 1; r <= 5; r++) {
            Stream<double[]> combinations = generateCombinations(elements, r)
                    .filter(combination -> {
                        // Koşula göre filtreleme yapılır
                        double sum = Arrays.stream(combination).sum();
                        return sum < targetSum;
                    });

            String fileName = "combinations_" + r + ".txt";
            writeCombinationsToFile(combinations, fileName);
            System.out.println("Kombinasyonlar (Uzunluk " + r + ") dosyaya yazıldı: " + fileName);
            System.out.println();
        }
    }

    private static Stream<double[]> generateCombinations(double[] elements, int r) {
        int n = elements.length;
        int[] indices = new int[r];
        double[] combination = new double[r];

        Stream.Builder<double[]> builder = Stream.builder();

        generateCombinationsHelper(elements, n, r, indices, 0, combination, builder);

        return builder.build();
    }

    private static void generateCombinationsHelper(double[] elements, int n, int r,
                                                   int[] indices, int currentIndex,
                                                   double[] combination,
                                                   Stream.Builder<double[]> builder) {
        if (currentIndex == r) {
            builder.add(Arrays.copyOf(combination, r));
            return;
        }

        int startIndex = currentIndex == 0 ? 0 : indices[currentIndex - 1] + 1;

        for (int i = startIndex; i < n; i++) {
            indices[currentIndex] = i;
            combination[currentIndex] = elements[i];
            generateCombinationsHelper(elements, n, r, indices, currentIndex + 1, combination, builder);
        }
    }

    private static void writeCombinationsToFile(Stream<double[]> combinations, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            combinations.forEach(combination -> {
                try {
                    writer.write(Arrays.toString(combination));
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

