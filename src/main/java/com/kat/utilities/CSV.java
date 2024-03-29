package com.kat.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<>();
        String dataRow;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((dataRow = bufferedReader.readLine()) !=null ){
            String[] dataRecords = dataRow.split(",");
            data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File corrupted");
            e.printStackTrace();
        }
        return data;
    }
}
