package home_work_1;

import java.util.Scanner;

public class Task4exercise4 {

    public String ByteOrKilobyte(Double number, boolean resultOfAnswer) {
        double numberOfByte = 1024;
        if (resultOfAnswer) {
            double resultByte = number * numberOfByte;
            String rez1 = "Перевод в байты числа " + number + " = " + resultByte;
            return rez1;
        } else {
            double resultKiloByte = number / numberOfByte;
            String rez2 ="Перевод в килобайты числа " + number + " = " + resultKiloByte;
            return rez2;
        }
    }
}
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Введите число 1: ");
        int numberFromUser = input.nextInt();
        System.out.print ("Переводим в байты (true) or килобайты (false)?  ");
        boolean resultOfAnswer1 = input.nextBoolean();
        int numberOfByte = 1024;
        if (resultOfAnswer1){
            int resultByte = numberFromUser * numberOfByte;
            System.out.print ("Перевод в байты числа " + numberFromUser + " = " + resultByte);
        } else {
            int resultKiloByte = numberFromUser / numberOfByte;
            System.out.print ("Перевод в байты числа " + numberFromUser + " = " + resultKiloByte);
        }
        /*
        System.out.print ("Переводим в байты (B) or килобайты (KB)?  ");
        String resultOfAnswer = input.next();
        int numberOfByte = 1024;
        if (resultOfAnswer.equals("B")){
            int resultByte = numberFromUser * numberOfByte;
            System.out.print ("Перевод в байты (B) числа " + numberFromUser + " = " + resultByte);
        } else if (resultOfAnswer.equals("KB")) {
            int resultKiloByte = numberFromUser / numberOfByte;
            System.out.print ("Перевод в байты (KB) числа " + numberFromUser + " = " + resultKiloByte);
        } else{
            System.out.print ("Вы ввели неверные данные");

        } */

