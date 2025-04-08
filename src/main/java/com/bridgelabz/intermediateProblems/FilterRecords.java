package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        String file = "data.csv";

        try(CSVReader reader = new CSVReader(new FileReader(file)) ){
            String[] line;
            reader.readNext(); // skip header
            while ((line = reader.readNext())!= null){
                if(Integer.parseInt(line[2]) >80){
                    System.out.println("Roll No: " + line[0] + ", Name: " + line[1] + ", Marks: "+ line[2]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
