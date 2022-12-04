package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Scanner;

public class Task6_3_main {
    public static void main(String[] args) {
        System.out.print ("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String nameFromUser = input.next();
        ICommunicationPrinter testSixThree = new Task6_3();
        System.out.println(testSixThree.welcom(nameFromUser));
    }

}
