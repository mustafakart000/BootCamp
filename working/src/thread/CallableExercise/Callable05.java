package thread.CallableExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

public class Callable05 {

    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};
        int numThreads = 3;
        ExecutorService exectutor = Executors.newFixedThreadPool(numThreads);
        Future<Integer>[] results = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final String fileName = fileNames[i];

            Callable<Integer> wordCountTask = () -> {
                int wordCount = 0;

                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    String line;
                    while((line=reader.readLine())!= null){
                        String[] words = line.split(" ");
                        wordCount += words.length;
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
                return wordCount;
            };

            results[i] = exectutor.submit(wordCountTask);

        }

        int totalWordCount = 0;

        for (int i = 0; i <numThreads ; i++) {
            try {
                totalWordCount += results[i].get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("total word count: "+ totalWordCount);
        exectutor.shutdown();
    }

}
