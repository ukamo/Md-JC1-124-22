package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextLong()) {
            long numberFromUser1 = Long.parseLong(input.next());
            long rez = 1;
            while (numberFromUser1 != 0) {
                for (int i = 0; i <= numberFromUser1; i++ ){
                    rez *= (numberFromUser1 % 10);
                    numberFromUser1 = numberFromUser1 / 10;
                }


            }
            //for (int i = 0;)
            System.out.println("Ваш результат: " + rez + " ");
        } else if (input.hasNextDouble() || (input.next().matches("^\\d+\\.\\d+$"))) {
            System.out.println("Вы ввели не целое число");
        } else {
            System.out.println("Вы ввели не число");
        }

    }
}
