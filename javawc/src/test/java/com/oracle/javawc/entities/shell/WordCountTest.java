/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.javawc.entities.shell;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.util.Arrays.*;

/**
 *
 * @author lgomes
 */
public class WordCountTest {

    public WordCountTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of showStatistics method, of class WordCount.
     */
    @Test
    public void testShowStatistics() {
    }

    /**
     * Test of countLines method, of class WordCount.
     */
    @Test
    public void testCountLineNull() {
        WordCount wc = new WordCount();
        assertThat(wc.countLines(null)).isEqualTo(0);
    }

    /**
     * Test of countLines method, of class WordCount.
     */
    @Test
    public void testCountLineEmptyLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("", "", "");

        assertThat(wc.countLines(lines)).isEqualTo(3);
    }

    /**
     * Test of countLines method, of class WordCount.
     */
    @Test
    public void testCountLineWithBlankSpaceLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList(" ", " ", " ");

        assertThat(wc.countLines(lines)).isEqualTo(3);
    }

    /**
     * Test of countLines method, of class WordCount.
     */
    @Test
    public void testCountLine4Lines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("line1 line1", "line2 line2", "line3 line3", "line4 line4");

        assertThat(wc.countLines(lines)).isEqualTo(4);
    }

    /**
     * Test of countWords method, of class WordCount.
     */
    @Test
    public void testCountWordsNull() {
        WordCount wc = new WordCount();
        assertThat(wc.countWords(null)).isEqualTo(0);
    }

    /**
     * Test of countWords method, of class WordCount.
     */
    @Test
    public void testCountWordsEmptyLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("", "", "");
        assertThat(wc.countWords(lines)).isEqualTo(0);
    }

    /**
     * Test of countWords method, of class WordCount.
     */
    @Test
    public void testCountWordsWithBlankSpaceLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList(" ", " ", " ");
        assertThat(wc.countWords(lines)).isEqualTo(0);
    }

    /**
     * Test of countWords method, of class WordCount.
     */
    @Test
    public void testCountWordsWith8Words() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("line1 line1", "line2 line2", "   line3   line3", " line4    line4 ", " ");
        assertThat(wc.countWords(lines)).isEqualTo(8);
    }

    /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsNull() {
        WordCount wc = new WordCount();
        assertThat(wc.countAvgLettersPerWords(null)).isEqualTo(0);
    }

    /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsEmptyLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("", "", "");
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(0);
    }

    /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsBlankSpaceLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList(" ", " ", "   ");
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(0);
    }

    /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsSameWordPerLine() {
        WordCount wc = new WordCount();
        String word = "1234";
        List<String> lines = Arrays.asList(word, word, word);
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(word.length());
    }

    /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsMultipleLinesAndOneWordPerLine() {
        WordCount wc = new WordCount();
        String word1 = "1234";
        String word2 = "12";
        List<String> lines = Arrays.asList(word1, word1, word1, word2, word2, word2);
                
        
        double expectedResult = (double) (word1.length() + word1.length() 
                + word1.length() + word2.length() + word2.length() 
                + word2.length()) / 6;
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(expectedResult);
    }

       /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsMultipleLinesAndTwoWordsPerLine() {
        WordCount wc = new WordCount();
        String word1 = "1234";
        String word2 = "12";
        String line1 = word1+" "+word1;
        String line2 = word2+" "+word2;
        String line3 = word1+" "+word2;
        List<String> lines = Arrays.asList(line1, line2, line3);                
        
        double expectedResult = (double) (word1.length() + word1.length() 
                + word2.length() + word2.length() + word1.length() 
                + word2.length()) / 6;
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(expectedResult);
    }

    
    
       /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsMultipleLinesAndMultipleWordsPerLineNoBlankSpace() {
        WordCount wc = new WordCount();
        String word1 = "1234";
        String word2 = "12";
        String word3 = "12345";

        String line1 = word1+" "+word2;
        String line2 = word2+" "+word3;
        String line3 = word1+" "+word3;
        List<String> lines = Arrays.asList(line1,line2,line3);
        
        double expectedResult = (double) (word1.length() + word2.length() 
                + word2.length() + word3.length() + word1.length() 
                + word3.length()) / 6;
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(expectedResult);
    }
    
    
        /**
     * Test of countAvgLettersPerWords method, of class WordCount.
     */
    @Test
    public void testCountAvgLettersPerWordsMultipleLinesAndMultipleWordsPerLine() {
        WordCount wc = new WordCount();
        String word1 = "1234";
        String word2 = "12";
        String word3 = "12345";

        String line1 = word1+" "+word2+" ";
        String line2 = word2+" "+word3;
        String line3 = word1+" "+word3+"     ";
        List<String> lines = Arrays.asList(line1,line2,line3);
                
        double expectedResult = (double) (word1.length() + word2.length() 
                + word2.length() + word3.length() + word1.length() 
                + word3.length()) / 6;
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(expectedResult);
    }

    
    /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterNull() {
        WordCount wc = new WordCount();
        assertThat(wc.mostCommonLetter(null)).isEmpty();
    }
    
    
        /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterEmptyLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("", "", "");
        assertThat(wc.mostCommonLetter(lines)).isEmpty();
    }
    
    /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterBlankLines() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList(" ", " ", " ");
        assertThat(wc.mostCommonLetter(lines)).isEmpty();
    }
    

        /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterUniqueResultOneWordPerLine() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("1", "22", "333");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("3");
    }

    
    /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterDuplicatedResultsWithNumbersOneWordPerLine() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("111", "222", "333", "aaa", "bbb");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("1");
    }


    /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterDuplicatedResultsOnlyLettersSortedLinesOneWordPerLine() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("aaa", "bbb", "ccc", "ddd", "zzz");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("a");
    }


        /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterUniqueResultMultipleWordsPerLine() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("1 22 333", "4444 55555", "666666 ");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("6");
    }

    
    /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterDuplicatedResultsWithNumbersMultipleWordsPerLine() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("111 aaa", "222 bbb", "333 ccc", "ddd", "eee");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("1");
    }


    /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterDuplicatedResultsOnlyLettersSortedLinesMultipleWordsPerLine() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("aaa bbb ccc", "ddd eee", " zzz fff ", "ggg", "hhh yyy ooo ");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("a");
    }
    
    
        /**
     * Test of mostCommonLetter method, of class WordCount.
     */
    @Test
    public void testMostCommonLetterWithWordString() {
        WordCount wc = new WordCount();
        List<String> lines = Arrays.asList("word1 word2 word3", "word1 word2 word3");
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("d");
    }
    
}
