package com.bridgelabz.basicProblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadCsv {
    public static void main(String[] args) {
        String file ="data.csv"; // file name

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            br.readLine(); // to skip header line
            while ((line = br.readLine()) != null){        // reading data till last line comes
                String[] data = line.split(",");    // splitting and storing data
                System.out.println("Id: " + data[0] + ", Name: " + data[1]); // printing data
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
