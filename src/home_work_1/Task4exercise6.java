package home_work_1;

import java.util.Scanner;

public class Task4exercise6 {
    public String retYear(Integer yearFromUser) {
        if (yearFromUser % 4 != 0 || yearFromUser % 100 == 0 && yearFromUser % 400 != 0) {
            String rez1 = "Год обычный";
            return rez1;
        } else {
            String rez2 ="Год високосный";
            return rez2;
        }
    }
}

/*
    public static void main(String[] args) {
        System.out.print ("Введите год: ");
        Scanner input = new Scanner(System.in);
        int yearFromUser = input.nextInt();

        if (yearFromUser % 4 != 0 || yearFromUser % 100 == 0 && yearFromUser % 400 != 0) {
            System.out.println("Год обычный");
        } else {
            System.out.println("Год високосный");
        }

    }
 */