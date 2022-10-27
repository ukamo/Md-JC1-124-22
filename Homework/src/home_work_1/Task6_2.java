package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        System.out.print ("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String nameFromUser = input.next();
        if (Objects.equals("Вася", nameFromUser)){
            System.out.println("Привет! \n Я тебя так долго ждал");
        } else if (Objects.equals("Анастасия", nameFromUser)){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
