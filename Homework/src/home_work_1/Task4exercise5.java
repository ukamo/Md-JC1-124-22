package home_work_1;

import java.util.Scanner;

public class Task4exercise5 {
    public static void main(String[] args) {
        System.out.print ("Введите символ 1: ");
        Scanner input = new Scanner(System.in);
        int numberFromUser = input.nextInt();
     /*   if (numberFromUser >= 65 && numberFromUser <= 90 ||
                numberFromUser >= 97 && numberFromUser <= 122 ){ */
       if (numberFromUser >= 'A' && numberFromUser <= 'Z' ||
                numberFromUser >= 'a' && numberFromUser <= 'z' ){
            System.out.print ("Это буква " + Character.toString(numberFromUser));
        } else {
            System.out.print ("Это Не буква, а символ " + Character.toString(numberFromUser));
        }
    }
}
