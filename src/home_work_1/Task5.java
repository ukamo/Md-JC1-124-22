package home_work_1;

import java.util.Scanner;



public class Task5 {


    public String sleepIn(Integer numberOfWeek, Boolean dayOfWeekends) {
        boolean weekday = false;
          if (numberOfWeek > 7 || numberOfWeek < 1){
            String rezError = "Такого дня недели не существует";
            return rezError;
        }
          else if (numberOfWeek == 6 || numberOfWeek == 7) {
            weekday = true;
        }
        boolean resultOfFunction = sleepInBoolean(weekday, dayOfWeekends);
        if (resultOfFunction) {
            String rez1 = "Спим дальше";
            return rez1;
        } else {
            String rez2 = "Пора идти на работу";
            return rez2;
        }
    }

    public static boolean sleepInBoolean (boolean weekday, boolean dayOfWeekends){
        if (weekday || dayOfWeekends){
            return true;
        } else {
            return false;
        }

        // return weekday || dayOfWeekends;
    }
}

/*
public static void main(String[] args) {
        System.out.print ("Ввод дня недели ");
        Scanner input = new Scanner(System.in);
        int numberOfWeek = input.nextInt();
        System.out.print ("У вас отпуск? true или false ");
        boolean dayOfWeekends = input.nextBoolean();
        boolean weekday = false;
        if (numberOfWeek >=6 && numberOfWeek<=7){
        weekday = true;
        }
        boolean resultOfFunction = sleepIn(weekday, dayOfWeekends);
        if (resultOfFunction){
        System.out.print ("Спим дальше");
        } else{
        System.out.print ("Пора идти на работу");
        }

        }

public static boolean sleepIn (boolean weekday, boolean dayOfWeekends){
        if (weekday || dayOfWeekends){
        return true;
        } else {
        return false;
        }

        // return weekday || dayOfWeekends;
        }*/