package home_work_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int number1 = inputNumber.nextInt();
        System.out.print("Input a number 2: ");
        int number2 = inputNumber.nextInt();
        int degreeNumbers = (int) Math.pow(number1,number2);
        System.out.print("\n Degree of 2 Numbers are: " + degreeNumbers);
        int ModuleNumber1 = (int) Math.abs(number1);
        int ModuleNumber2 = (int) Math.abs(number2);
        System.out.print("\n Module of the first Number is: " + ModuleNumber1);
        System.out.print("\n Module of the second Number is: " + ModuleNumber2);
    }
}
