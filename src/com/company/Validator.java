package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public  class Validator {

   static int requestInt(Scanner scanner){
        boolean isInt;
        int input = 0;
        do {
            try {
                input = scanner.nextInt();
                isInt = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("please try again");
                scanner.nextLine();
                isInt =false;
            }
        }while (!isInt);

        return Math.abs(input);
    }

    static LocalDate requestDate(Scanner scanner){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        boolean isValidDate;
        LocalDate date =  LocalDate.now();
       do{
           try {
               date = LocalDate.parse(scanner.next(), dateFormat);
               isValidDate =true;
           }catch (DateTimeException e){
               System.out.println("This is not a  valid date try again");
               scanner.nextLine();
               isValidDate =false;
           }


       }while (!isValidDate);

       return date;
    }

    static boolean isAFutureDate(LocalDate date){
       boolean isValidDate = false;

        if(date.isBefore(LocalDate.now())){
            System.out.println("This date has past, please add another one");
        }else {
            isValidDate = true;
        }
       return isValidDate;
    }


}
