package home_work_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int number1 = inputNumber1.nextInt();
        System.out.print("Input a number 2: ");
        int number2 = inputNumber1.nextInt();
        int degreeNumbers = (int) Math.pow(number1,number2);
        System.out.print("Degree of 2 Numbers are: " + degreeNumbers);
    }
}
