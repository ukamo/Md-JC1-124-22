package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
     public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int numberSave1 = inputNumber1.nextInt();
        Scanner inputNumber2 = new Scanner(System.in);
        System.out.print("Input a number 2: ");
        int numberSave2 = inputNumber2.nextInt();
        int saveByteAndResult = numberSave1&numberSave2;
        System.out.println(saveByteAndResult);
        int saveByteOrResult = numberSave1|numberSave2;
        System.out.println(saveByteOrResult);
    }
}
