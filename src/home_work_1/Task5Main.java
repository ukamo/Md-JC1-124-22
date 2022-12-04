package home_work_1;

import java.util.Scanner;


public class Task5Main {
    public static void main(String[] args) {
        System.out.print ("Ввод дня недели ");
        Scanner input = new Scanner(System.in);
        int numberOfWeek = input.nextInt();
        System.out.print ("У вас отпуск? true или false ");
        boolean dayOfWeekends = input.nextBoolean();
        boolean weekday = false;
        Task5 executeClass = new Task5();
        executeClass.sleepIn(numberOfWeek, dayOfWeekends);

    }
}
