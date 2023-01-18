/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.javawc.entities.shell;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author lgomes
 */
public class FileLoaderTest {

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder();

    /**
     * Test of loadFile method, of class FileLoader.
     */
    @Test
    public void testLoadFile_Path() throws Exception {
        File file1 = testFolder.newFile("file1.txt");

        Collection<String> input = new ArrayList<>();
        Collections.addAll(input, "word1 word2 word3", "word1 word2 word3");
        FileUtils.writeLines(file1, Charset.forName("UTF-8").name(), input, true);

        Path path = file1.toPath();
        FileLoader instance = new FileLoader();
        List<String> lines = instance.loadFile(path);
        WordCount wc = new WordCount();

        assertThat(wc.countLines(lines)).isEqualTo(2);
        assertThat(wc.countWords(lines)).isEqualTo(6);
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(5);
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("d");

    }

    
    /**
     * Test of loadFile method, of class FileLoader.
     */
    @Test
    public void testLoadFile_String() throws Exception {
        File file1 = testFolder.newFile("file1.txt");

        Collection<String> input = new ArrayList<>();
        Collections.addAll(input, "word1 word2 word3", "word1 word2 word3");
        FileUtils.writeLines(file1, Charset.forName("UTF-8").name(), input, true);

        
        FileLoader instance = new FileLoader();
        List<String> lines = instance.loadFile(file1.getAbsolutePath());
        WordCount wc = new WordCount();

        assertThat(wc.countLines(lines)).isEqualTo(2);
        assertThat(wc.countWords(lines)).isEqualTo(6);
        assertThat(wc.countAvgLettersPerWords(lines)).isEqualTo(5);
        assertThat(wc.mostCommonLetter(lines)).isEqualTo("d");

    }
    
    
    /**
     * Test of loadFile method, of class FileLoader.
     */
    @Test
    public void testLoadFile_Path_Charset() throws Exception {
        File file1 = testFolder.newFile("file1.txt");

        Collection<String> input = new ArrayList<>();
        Collections.addAll(input, "word1 word2 word3", "word1 word2 word3");
        FileUtils.writeLines(file1, Charset.forName("UTF-8").name(), input, true);

        Path path = file1.toPath();
        FileLoader instance = new FileLoader();
        WordCount result = new WordCount();
        List<String> lines = instance.loadFile(path, Charset.forName("UTF-8"));

        assertThat(result).isNotNull();
        assertThat(result.countLines(lines)).isEqualTo(2);
        assertThat(result.countWords(lines)).isEqualTo(6);
        assertThat(result.countAvgLettersPerWords(lines)).isEqualTo(5);
        assertThat(result.mostCommonLetter(lines)).isEqualTo("d");
    }

    /**
     * Test of loadFile method, of class FileLoader.
     */
    @Test
    public void testLoadFile_String_Charset() throws Exception {
        File file1 = testFolder.newFile("file1.txt");

        Collection<String> input = new ArrayList<>();
        Collections.addAll(input, "word1 word2 word3", "word1 word2 word3");
        FileUtils.writeLines(file1, Charset.forName("UTF-8").name(), input, true);
        
        FileLoader instance = new FileLoader();
        WordCount result = new WordCount();
        List<String> lines = instance.loadFile(file1.getAbsolutePath(), Charset.forName("UTF-8"));

        assertThat(result).isNotNull();
        assertThat(result.countLines(lines)).isEqualTo(2);
        assertThat(result.countWords(lines)).isEqualTo(6);
        assertThat(result.countAvgLettersPerWords(lines)).isEqualTo(5);
        assertThat(result.mostCommonLetter(lines)).isEqualTo("d");
    }
    
    
}
