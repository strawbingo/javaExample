package com.strawbingo.io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

//中文
public class StreamAndReader {


    public static void main(String[] args) throws IOException {
        readAsStream();
        System.out.println("------------------------------");
        readAsFile();
    }

    private static void readAsStream() throws IOException {
        InputStream input = new FileInputStream("/Users/leeco/GitHub/com/strawbingo/javaExample/java8/src/main/resources/readMe.txt");

        int data = input.read();

        while(data != -1){
            System.out.println(data);
            data = input.read();
        }
    }

    private static void readAsFile() throws IOException {
        FileReader reader = new FileReader("/Users/leeco/GitHub/com/strawbingo/javaExample/java8/src/main/resources/readMe.txt");

        int data = reader.read();

        while(data != -1){
            System.out.println(data);
            data = reader.read();
        }
    }

}
