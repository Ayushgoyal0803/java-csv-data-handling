package com.bridgelabz.advanceProblems;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;


public class CsvToObject {
    public static void main(String[] args) {
        String file = "student.csv";

        try (FileReader reader = new FileReader(file)){
            CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(reader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Student> students = csvToBean.parse();

            for (Student student : students) {
                System.out.println(student);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
