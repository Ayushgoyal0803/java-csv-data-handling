package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;


public class ModifyData {
    public static void main(String[] args) {
        String inputFile =  "inputEmp.csv";
        String outputFile = "outputEmp.csv";

        try(CSVReader reader = new CSVReader(new FileReader(inputFile));
            CSVWriter writer = new CSVWriter(new FileWriter(outputFile))){
            String[] line;

            while ( (line = reader.readNext()) !=null){
                if(line[2].equals("IT")){
                    String sal = line[3];
                    double salary  = Integer.parseInt(sal);
                    salary *= 1.10;
                    line[3] = Double.toString(salary) ;
                }
                writer.writeNext(line);
            }

            System.out.println("File updated Successfully.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
