package home_work_1;

import home_work_1.api.ICommunicationPrinter;
import home_work_3.calcs.api.ICalculator;

import java.util.Objects;
import java.util.Scanner;

public class Task6_1 implements ICommunicationPrinter {
    @Override
    public String welcom(String nameFromUser) {
        if (Objects.equals("Вася", nameFromUser)) {
            String stringVas = "Привет! \nЯ тебя так долго ждал";
            return stringVas;
        }

        if (Objects.equals("Анастасия", nameFromUser)) {
            String stringAnast = "Я тебя так долго ждал";
            return stringAnast;
        } else {
            String stringWho = "Добрый день, а вы кто?";
            return stringWho;
        }
    }
}
    /*public static void main(String[] args) {
        System.out.print ("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String nameFromUser = input.next();
        if (Objects.equals("Вася", nameFromUser)){
            System.out.println("Привет! \n Я тебя так долго ждал");
        }

        if (Objects.equals("Анастасия", nameFromUser)){
            System.out.println("Я тебя так долго ждал");
        }else {
            System.out.println("Добрый день, а вы кто?");
        }
    } */

