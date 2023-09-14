package thread.CallableExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

public class Callable06 {


    /*Aşağıda, farklı dosyalardan metin okuyarak kelime sayısı ve harf sayısı hesaplayan bir çoklu iş parçacığı
    programını içeren bir örnek kod bulunmaktadır:*/

    public static void main(String[] args) {
        String[] fileNames ={"file1.txt","file2.txt","file3.txt"};
        int numThread = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numThread);

        Future<CountResult>[] results = new Future[numThread];

        for (int i = 0; i <numThread ; i++) {
            final String fileName = fileNames[i];


            Callable<CountResult> wordAndCharacterCountTask = () -> {
                    int wordCount = 0;
                    int characterCount = 0;

                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(fileName));
                        String line;
                        while((line = reader.readLine()) != null) {
                            String[] words = line.split(" ");
                            wordCount += words.length;
                            characterCount += line.length();
                        }
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    return new CountResult(wordCount, characterCount);
            };

            results[i] = executor.submit(wordAndCharacterCountTask);

        }

        int totalWordCount = 0;
        int totalCharacterCount = 0;
        for (int i = 0; i <numThread ; i++) {
            try {
                CountResult result = results[i].get();
                totalWordCount+= result.getWordCount();
                totalCharacterCount += result.getCharacterCount();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("total word Count: "+totalWordCount);
        System.out.println("total character count: "+ totalCharacterCount);
        executor.shutdown();
    }
}

 class CountResult{
    private int wordCount;
    private int characterCount;

     public CountResult(int wordCount, int characterCount) {
         this.wordCount = wordCount;
         this.characterCount = characterCount;


     }

     public int getWordCount() {
         return wordCount;
     }

     public int getCharacterCount() {
         return characterCount;
     }
 }
