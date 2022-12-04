package home_work_1;

import java.util.Scanner;

public class Task4exercise5Main {
    public static void main(String[] args) {
            System.out.print ("Введите 1 код-число по таблице ASCII (учитывается только английский алфавит,от 33 до 126)");
            Scanner input = new Scanner(System.in);
            int numberFromUser = input.nextInt();
            Task4exercise5 checkNumber = new Task4exercise5();
            System.out.println(checkNumber.letterIrSymbol(numberFromUser));
    }
}

