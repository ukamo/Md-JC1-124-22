package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.print ("Введите первое число: ");
        Scanner input = new Scanner(System.in);
        double numberFromUser1 = input.nextDouble();
        System.out.print ("Введите второе число: ");
        int numberFromUser2 = input.nextInt();
        double resultOfRoot = 1;
        for (int i = 1; i <= numberFromUser2; i++){
            resultOfRoot = numberFromUser1 * resultOfRoot;
        }
        System.out.println("Ваш результат: " + resultOfRoot);

    }
}

