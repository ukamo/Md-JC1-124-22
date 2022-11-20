package home_work_2.loops;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.print("Введите целое число от 1 до 19 для определения факториала: ");
        Scanner input = new Scanner(System.in);

        if (input.hasNextLong()) {
            long numberFromUser1 = Long.parseLong(input.next());
            int minRez = 1;
            int maxRez = 19;
            if (numberFromUser1 >= minRez && numberFromUser1 <= maxRez) {
                long resultNumb = 1;
                for (long i = 1; i <= numberFromUser1; i++) {
                    if (i!=numberFromUser1){
                        System.out.print(i + " * ");
                    } else {
                        System.out.print(i + " = ");
                    }
                    resultNumb = resultNumb * i;


                }
                System.out.println(resultNumb);
            } else {
                System.out.println("Вы ввели неверное значение");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
