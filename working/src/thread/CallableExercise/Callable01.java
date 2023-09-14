package thread.CallableExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.*;

public class Callable01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> characterCountTask = () -> {
            int characterCount = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    characterCount += line.length();
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return characterCount;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor. submit(characterCountTask);


        int totalChracterCount = future.get();
        System.out.println("Total characters in the file: "+ totalChracterCount);
            executor.shutdown();
       }

    }


