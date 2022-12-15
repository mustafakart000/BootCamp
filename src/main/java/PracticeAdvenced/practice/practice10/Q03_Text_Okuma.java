package PracticeAdvenced.practice.practice10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_Text_Okuma {
    //Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.
    public static void main(String[] args) throws IOException {
        BufferedReader file= new BufferedReader(new FileReader("src/main/java/PracticeAdvenced/practice/practice10/helloWord.txt"));
        file.readLine();
        file.readLine();
        String line3=file.readLine();
        System.out.println(line3);
        String[] arr=line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        String line = null;
        while (file.readLine()!=null){
            line= file.readLine();
        }
        System.out.println(line);

    }
}

