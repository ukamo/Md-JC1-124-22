package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class Task6_3 implements ICommunicationPrinter {
    @Override
    public String welcom(String nameFromUser) {
        switch (nameFromUser) {
            case "Вася":
                String strVas = "Привет!\nЯ тебя так долго ждал";
                return strVas;
            case "Анастасия":
                String strAnas = "Я тебя так долго ждал";
                return strAnas;
            default:
                String strWho = "Добрый день, а вы кто?";
                return strWho;
        }
    }
}

   /* public static void main(String[] args) {
        System.out.print ("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String nameFromUser = input.next();
        switch (nameFromUser) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:  System.out.println("Добрый день, а вы кто?");
        }
    }

    */

