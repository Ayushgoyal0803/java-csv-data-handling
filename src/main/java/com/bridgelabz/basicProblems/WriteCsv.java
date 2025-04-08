package com.bridgelabz.basicProblems;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void main(String[] args) {
        String file = "emp.csv";

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            br.write("ID,Name,Salary\n");
            br.write("101,Ayush,40000\n");
            br.write("102,Emma,35000\n");
            br.write("103,Ashish,45000\n");

            System.out.println("Data written successfully.");

//            br.close();

        }catch (IOException e){
            System.out.println("Error in writing data to the file.");
        }
    }
}
