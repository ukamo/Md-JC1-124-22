package home_work_1;

import java.util.Scanner;

public class Task4exercise2Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        double number1 = inputNumber.nextDouble();

        System.out.print("Input a number 2: ");
        double number2 = inputNumber.nextDouble();

        System.out.print("Input a number 3: ");
        double number3 = inputNumber.nextDouble();

        Task4exercise2 task4For2 = new Task4exercise2();
        System.out.println(task4For2.threeNumbers(number1, number2, number3));
    }
}
