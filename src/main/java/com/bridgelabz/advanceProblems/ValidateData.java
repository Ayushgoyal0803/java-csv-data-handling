package com.bridgelabz.advanceProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ValidateData {
    public static void main(String[] args) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9]+\\.[a-z]{2,}$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emaiPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        String file = "ValidData.csv";
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
        br.readLine(); // skips header
         while ((line = br.readLine())!= null){
             String[] col = line.split(",");
             String name = col[0];
             String email = col[1];
             String phone = col[2];
             boolean isValid = true;
             if(!emaiPattern.matcher(email).matches()){
                 System.out.println("Invalid email: " + email);
                isValid =false;
             }

             if (!phonePattern.matcher(phone).matches()){
                 System.out.println("Invalid phone number: " + phone);
                isValid = false;
             }

             if(isValid){
                 System.out.println("Row is valid " + name);
             }
         }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
