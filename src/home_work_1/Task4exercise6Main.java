package home_work_1;

import java.util.Scanner;

public class Task4exercise6Main {
    public static void main(String[] args) {
        System.out.print ("Введите год: ");
        Scanner input = new Scanner(System.in);
        int yearFromUser = input.nextInt();
        Task4exercise6 year = new Task4exercise6();
        System.out.println(year.retYear(yearFromUser));
    }
}
