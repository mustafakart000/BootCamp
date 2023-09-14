package thread.CallableExercise;

import java.util.concurrent.*;

public class Callable07{


    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int numThreads = numCols; //Her bir sütun için bir iş parçacığı
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        Future<int[]>[] results = new Future[numCols];

        for (int col = 0; col < numCols; col++ ) {
                final int currentCol = col;


            //her sütun transpozunu hesaplayan iş parçacıkları oluşturulur
            Callable<int[]> transposeColumnTask = ()-> {
              int[] transposedColumn = new int[numRows];

                for (int row = 0; row <numRows; row++) {
                    transposedColumn[row] = matrix[row][currentCol];
                    System.out.print(transposedColumn[row]+" ");
                }
                System.out.println();
                return transposedColumn;
            };

            results[col] = executor.submit(transposeColumnTask);
        }
        // Transpozunu hesaplanmış sütunlar birleştirilerek sonuç matrisi oluşturulur
        int[][] transposeMatrix = new int[numCols][numRows];
        for (int col = 0; col <numCols ; col++) {
            try {
                transposeMatrix[col] = results[col].get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        //sonuc matrisi yazdır.
        for (int row = 0; row <numRows ; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.print(transposeMatrix[row][col] + " ");
            }
            System.out.println();
        }
        executor.shutdown();

    }
}
