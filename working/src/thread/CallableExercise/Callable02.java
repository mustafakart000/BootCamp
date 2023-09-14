package thread.CallableExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

public class Callable02 {


    /*bir metin dosyasında bulunan kelimelerin uzunluklarının toplamını hesaplamak istiyoruz. Aynı zamanda her
    kelimenin uzunluğunu hesaplamak için bir yardımcı iş parçacığı kullanarak çoklu iş parçacığı programlaması
    uygulayacağız.

İşte bu senaryoya göre bir örnek:*/

    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> wordLengthTask = ()->{

            int totalLength = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
                String line;
                while((line = reader.readLine())!=null) {
                    String[] words = line.split(" ");
                    totalLength+= words.length;
//                    for (String ignored : words) {
//                        totalLength += 1;
//                    }
                }

                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return totalLength;
        };

        Callable<Integer> individualWordLengthTask =()->{

            int individualTotalLength =0;

            try {
                BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
                String line;
                while((line=reader.readLine())!=null){

                    String[] words = line.split(" ");
                    for (String word: words) {

                        individualTotalLength += word.length();

                        System.out.println("word: " + word + ", length: "+ word.length());

                    }

                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return individualTotalLength;
        };

        Future<Integer> totalLengthFuture = executor.submit(wordLengthTask);
        Future<Integer> individiualTotalLengthFuture =executor.submit(individualWordLengthTask);

        try {
            int totalLength = totalLengthFuture.get();
            int individualTotalLength = individiualTotalLengthFuture.get();
            System.out.println("Total length of Words: "+ totalLength);
            System.out.println("individual Total length of words: "+ individualTotalLength);

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    executor.shutdown();

    }

}
