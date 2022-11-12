package com.company.fileHandling;

import java.io.*;

public class ReadingCsvFile {

    public static void readFile() throws IOException {

        File file = new File("");

        FileReader reader = new FileReader(file);

        BufferedReader br = new BufferedReader(reader);

        String line;

        while ((line = br.readLine()) != null) {

           String [] columns = line.split(",");

           for(String column : columns)
               System.out.println(column);

        }

    }
}
