package com.bridgelabz.basicProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class CountRows {
    public static void main(String[] args) {
        String file = "emp.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            br.readLine();
            int count = 0;
            while ((line = br.readLine()) != null){
                count++;
            }
            System.out.println("No of records in file are: " + count);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
