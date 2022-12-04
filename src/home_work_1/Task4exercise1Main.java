package home_work_1;

import java.util.Scanner;

public class Task4exercise1Main {
    public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input number 1: ");
        double number1 = inputNumber1.nextDouble();
        Task4exercise1 task = new Task4exercise1();
        task.even(number1);
    }

}
