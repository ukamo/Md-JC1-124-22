package home_work_1;

import java.util.Scanner;

public class Task4exercise4Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Введите число 1: ");
        double numberFromUser = input.nextDouble();
        System.out.print ("Переводим в байты (true) or килобайты (false)?  ");
        boolean resultOfAnswer1 = input.nextBoolean();
        Task4exercise4 byteOrkilo = new Task4exercise4 ();
        System.out.println(byteOrkilo.ByteOrKilobyte(numberFromUser,resultOfAnswer1));
    }

}
