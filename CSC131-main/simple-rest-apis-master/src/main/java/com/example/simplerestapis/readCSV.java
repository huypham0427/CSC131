package com.example.simplerestapis;

import java.io.*;
public class readCSV{
    public static void main(String args[]) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "D://javaWeb/CSC131Project-master/CSC131-main/simple-rest-apis-master/src/main/resources/KaggleData_the_oscar_award.csv"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
