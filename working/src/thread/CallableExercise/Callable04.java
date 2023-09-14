package thread.CallableExercise;

import java.util.concurrent.*;

public class Callable04 {
    //NOT: Callable03 class'ındaki ornek ile benzer bir ornektir.


    /*Bir dizi sayının faktöriyelini hesaplayan bir çoklu iş parçacığı programı yapmak istiyoruz. Her bir iş parçacığı,
     belirli bir aralıktaki sayıların faktöriyelini hesaplayacak ve sonuçları bir toplama işlemi ile birleştireceğiz.*/


    public static void main(String[] args) {
        int start =  1;
        int end   = 10;
        int numThread = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThread);
        Future<Long>[] results   = new Future[numThread];

        int step = (end - start + 1) / numThread;
        int currentStart = start;
        int currentEnd = start + step -1;
        for (int i = 0; i <numThread ; i++) {
                if ( i == numThread -1) {
                    currentEnd= end;
                }
                 int startRange  = currentStart;
                 int endRange = currentEnd;

            Callable<Long> factorialTask = ()-> {
                long result = 1;
                for (int num = startRange; num <= endRange ; num++) {
                    result *= calculateFactorial(num);
                }
                return  result;
            };

            results[i] = executor.submit(factorialTask);
            currentStart = currentEnd + 1;
            currentEnd   = currentStart + step -1;

        }

        long totalFactorial = 1;
        for (int i = 0; i < numThread ; i++) {

            try {
                totalFactorial *= results[i].get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("Total factorial: " + totalFactorial); //3885473706566221824
        executor.shutdown();
    }

    private static int calculateFactorial(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {

            fact *= i;

        }
        return fact;
    }

}
