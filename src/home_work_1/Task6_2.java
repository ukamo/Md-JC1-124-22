package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class Task6_2 implements ICommunicationPrinter {

    @Override
    public String welcom(String nameFromUser) {
        if (Objects.equals("Вася", nameFromUser)) {
            String string1 = "Привет! \nЯ тебя так долго ждал";
            return string1;
        } else if (Objects.equals("Анастасия", nameFromUser)) {
            String string2 = "Я тебя так долго ждал";
            return string2;
        } else {
            String string3 = "Добрый день, а вы кто?";
            return string3;
        }
    }
}
    /*
    public static void main(String[] args) {
        System.out.print ("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String nameFromUser = input.next();
        if (Objects.equals("Вася", nameFromUser)){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else if (Objects.equals("Анастасия", nameFromUser)){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
     */

