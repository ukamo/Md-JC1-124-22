package home_work_1;

import java.util.Scanner;

public class Task4exercise3 {
    public String DivideTwoNumbers(Double number1, Double number2) {
        if (number1 % number2 == 0) {
            String statement1 = "Число 1 делится на число 2 без остатка";
            return statement1;
        } else {
            if (number2 == 0) {
                String zero = "На ноль делить нельзя";
                //System.out.println(zero);
                return zero;
            } else {
                double rest = number1 % number2;
                String statementRest = "Остаток: " + rest + " ";
                double rez = number1 / number2;
                String statement2 = " Результат от деления: " + rez;
                statementRest = statementRest.concat(statement2);
                return statementRest;
            }
        }
    }
}

/*
    public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = inputNumber1.nextInt();

        System.out.print("Введите число 2: ");
        int number2 = inputNumber1.nextInt();

        if ( number1 % number2 == 0 ) {
            System.out.println("Число 1 делится на число 2 без остатка");
        } else {
            double rest = number1 % number2;
            System.out.println("Остаток: " + rest);
            int rez = number1 / number2;
            System.out.println("Результат от деления: " + rez);
        }
    }*/
