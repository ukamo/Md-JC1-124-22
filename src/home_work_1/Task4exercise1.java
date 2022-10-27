package home_work_1;

import java.util.Scanner;

public class Task4exercise1 {
    public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number1 = inputNumber1.nextInt();

        if ( number1 % 2 == 0 ) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
