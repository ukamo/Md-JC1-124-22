package home_work_2.loops;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.print("Введите целое число от 1 до 63 для определения факториала: ");
        Scanner input = new Scanner(System.in);

        if (input.hasNextLong()) {
            long numberFromUser1 = Long.parseLong(input.next());
            int minRez = 1;
            int maxRez = 63;
            if (numberFromUser1 >= minRez && numberFromUser1 <= maxRez) {
                long resultNumb = 1;
                for (long i = 1; i <= numberFromUser1; i++) {
                    //resultNumb = resultNumb * i;
                    long y = resultNumb;
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
