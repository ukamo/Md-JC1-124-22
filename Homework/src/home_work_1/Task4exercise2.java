package home_work_1;

import java.util.Scanner;

public class Task4exercise2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int numberSave1 = inputNumber.nextInt();

        System.out.print("Input a number 2: ");
        int numberSave2 = inputNumber.nextInt();

        System.out.print("Input a number 3: ");
        int numberSave3 = inputNumber.nextInt();

        if (numberSave1 > numberSave2 && numberSave1 < numberSave3 || numberSave1 < numberSave2 && numberSave1 > numberSave3 ){
            System.out.print("Result: the first number is " + numberSave1);
        } else if (numberSave2 > numberSave1 && numberSave2 < numberSave3 || numberSave2 < numberSave1 && numberSave2 > numberSave3) {
            System.out.print("Result: the second number is " + numberSave2);
        } else if (numberSave3 > numberSave1 && numberSave3 < numberSave2 || numberSave3 < numberSave1 && numberSave3 > numberSave2) {
            System.out.print("Result: the third number is " + numberSave3);
            //можно оставить с else, но так можно быстрее дополнить этот код, в случае необходимости
        }
    }
}
