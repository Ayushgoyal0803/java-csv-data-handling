package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class SearchRecord {
    public static void main(String[] args) {
        String file = "emp.csv";
        String emp = "Ayush";

        try(CSVReader reader = new CSVReader(new FileReader(file))){
            String[] line;
            reader.readNext(); // skip header

            while ((line = reader.readNext()) != null){
                if(line[1].equals(emp)){
                    System.out.println("Employee " + line[1] + " details found.");
                    System.out.println("Salary: " + line[2]);
                    System.out.println("Department: " + line[3]);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

