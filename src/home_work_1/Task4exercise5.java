package home_work_1;

import java.util.Scanner;

public class Task4exercise5 {
    public String letterIrSymbol (Integer numberFromUser) {
        if (numberFromUser >= 33 & numberFromUser <= 126){
            if (numberFromUser >= 'A' && numberFromUser <= 'Z' ||
                    numberFromUser >= 'a' && numberFromUser <= 'z') {
                String rez1 = "Это буква " + Character.toString(numberFromUser);
                return rez1;
            } else {
                String rez2 = "Это Не буква, а символ " + Character.toString(numberFromUser);
                return rez2;
            }
        } else{
            String rezNo = "Число не принадлежит выбранному диапазону";
            return rezNo;
        }

    }
}

  /*  public static void main(String[] args) {
        System.out.print ("Введите 1 английский символ: ");
        Scanner input = new Scanner(System.in);
        int numberFromUser = input.nextInt();
     //   if (numberFromUser >= 65 && numberFromUser <= 90 ||
     //           numberFromUser >= 97 && numberFromUser <= 122 ){
        if (numberFromUser >= 'A' && numberFromUser <= 'Z' ||
                numberFromUser >= 'a' && numberFromUser <= 'z' ){
            System.out.print ("Это буква " + Character.toString(numberFromUser));
        } else {
            System.out.print ("Это Не буква, а символ " + Character.toString(numberFromUser));
        }
    }*/


