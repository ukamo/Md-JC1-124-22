package home_work_1;

import java.util.Scanner;

public class Task4exercise2 {
    public static void main(String[] args) {
        //static numbers
        /*
        int numberSave1 = 2;
        int numberSave2 = 3;
        int numberSave3 = 6;

         */

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int numberSave1 = inputNumber.nextInt();

        System.out.print("Input a number 2: ");
        int numberSave2 = inputNumber.nextInt();

        System.out.print("Input a number 3: ");
        int numberSave3 = inputNumber.nextInt();


        int sumThreeNumbers = numberSave1 + numberSave2 + numberSave3;
        int average = sumThreeNumbers/ 3;
        System.out.print("Average number is " + average);
    }
}
