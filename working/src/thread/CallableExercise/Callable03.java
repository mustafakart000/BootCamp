package thread.CallableExercise;

import java.util.concurrent.*;

public class Callable03 {
    /*bir matematiksel işlem yapmanız gerekiyor ve bu işlemi paralel olarak farklı alt işlemlere bölmek istiyorsunuz.
     Her alt işlem ayrı bir iş parçacığı olarak yürütülecek ve sonuçlar toplanarak nihai sonuca ulaşılacak.

Örnek olarak, 1'den 1000'e kadar olan sayıların karelerini toplamak istediğinizi düşünelim. Bu işlemi paralel olarak
yapmak için Callable yapısını kullanabilirsiniz. Aynı zamanda alt işlemleri yönetmek ve sonuçları toplamak için Future
 yapısını kullanabilirsiniz.

Soru: Verilen aralıktaki sayıların karelerini paralel olarak hesaplayarak toplayan bir Java programı nasıl oluşturulur?
 Callable ve Future yapısını kullanarak bu işlemi gerçekleştirin.

Bu senaryo, iş parçacığı programlamasının günlük hayatta nasıl kullanılabileceğini daha iyi anlamanıza yardımcı olacaktır.
Bu örneği kodlayarak iş parçacığı programlaması ve sonuçların toplanması konusundaki anlayışınızı daha da
 güçlendirebilirsiniz.*/

    public static void main(String[] args) {
        int start =1;
        int end =1000;
        int numThreads = 4; //thread sayısı
        ExecutorService executer = Executors.newFixedThreadPool(numThreads);
        Future<Integer>[] results = new Future[numThreads];
        int step = (end- start +1) /numThreads;
        int currentStart = start;
        int currentEnd = start + step -1;

        for (int i = 0; i <numThreads ; i++) {
                    if (i == numThreads -1){
                        currentEnd =end; //

                        }
                     int startRange = currentStart;
                     int endRange = currentEnd;

                    Callable<Integer> squareSumTask =()->{
                     int sum =0;
                        for (int num = startRange; num <= endRange ; num++) {
                            sum += num * num;
                        }
                        return sum;
                    };

                    results[i] =executer.submit(squareSumTask);
                    currentStart = currentEnd + 1;
                    currentEnd = currentStart + step -1;
        }

        int totalSum = 0;
        for (int i = 0; i < numThreads ; i++) {
                    try {
                        totalSum +=results[i].get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
        }

        System.out.println("total sum of squares: " + totalSum);
        executer.shutdown();

    }
}
