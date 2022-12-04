package home_work_1;

import java.util.Scanner;

public class Task4exercise3Main {
    public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double number1 = inputNumber1.nextDouble();

        System.out.print("Введите число 2: ");
        double number2 = inputNumber1.nextDouble();
        Task4exercise3 divideRez = new Task4exercise3 ();
        System.out.println(divideRez.DivideTwoNumbers(number1,number2));
    }

}
