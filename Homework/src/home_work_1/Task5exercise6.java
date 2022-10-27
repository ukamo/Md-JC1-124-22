package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5exercise6 {
    public static void main(String[] args) {
        System.out.print ("Введите год: ");
        Scanner input = new Scanner(System.in);
        int yearFromUser = input.nextInt();
        if (yearFromUser % 4 != 0) {
            System.out.println("Год обычный");
        } else if (yearFromUser % 100 == 0){
                if (yearFromUser % 400 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год обычный");
                }
        } else {
            System.out.println("Год високосный");
        }
    }
}
