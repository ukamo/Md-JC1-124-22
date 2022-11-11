package home_work_2.loops;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
       // maxNumber();
       // probability();
        //countEvenAndOdd ();
        //fibonacciSequence ();
        //numbersWithStep ();
        //numberFlip();
    }

    public static void maxNumber() {
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        long numberFromUser = input.nextInt();
        long maxNumber = numberFromUser % 10;
        long numbDivide = numberFromUser / 10;
        while (numbDivide > 0) {
            if (numbDivide % 10 > maxNumber) {
                maxNumber = numbDivide % 10;
                numbDivide = numbDivide / 10;
            }
        }
        System.out.println(maxNumber);
    }
    public static void probability () {
        int number = 10;
        int counter = 0;
       // int random = (int) (Math.random()*1000);
        int random;
        int rez;
        for (int i = 0; i < number; i++){
            random = (int) (Math.random()*1000);
            if (random % 2 == 0){
                counter += 1;
            }
        }
        rez =  counter * 100 / number ;
        System.out.println("результат " + rez + " %");
    }
    public static void countEvenAndOdd () {
        System.out.print("Введите число: ");
        Scanner input2 = new Scanner(System.in);
        long numberFromUser = input2.nextInt();
        int odd = 0;
        int even = 0;
       while (numberFromUser > 0) {
           if (numberFromUser % 2 == 0) {
               even += 1;
               numberFromUser = numberFromUser / 10;
           } else {
               odd += 1;
               numberFromUser = numberFromUser / 10;
           }
       }
       System.out.println("Четных цифр: " + even +"\n"+ "Нечетных цифр: "+ odd);
    }
    public static void fibonacciSequence () {
        System.out.print("Сколько чисел нужно вывести с ряда Финнабочи: ");
        Scanner input3 = new Scanner(System.in);
        int numberFromUser = input3.nextInt();
        int count=0;
        int number1 = 1;
        int number2 = 2;
        System.out.println(number1 + "\n" +  number2);
        for (int i = 3; i<=numberFromUser; i++){
            System.out.println(number1 + number2);
            int a = number1;
            number1 = number2;
            number2 = a + number2;
        }
        System.out.println("\n");
    }
    public static void numbersWithStep () {
        System.out.print("Минимум: ");
        Scanner inputNumber = new Scanner(System.in);
        int numberMin = inputNumber.nextInt();
        System.out.print("Максимум: ");
        int numbMax = inputNumber.nextInt();
        System.out.print("Шаг: ");
        int numbStep = inputNumber.nextInt();

        for (int i = numberMin; i <= numbMax; i = i + numbStep){
            System.out.println(i);
        }
    }
    public static void numberFlip () {
        System.out.print("Ввести число: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        int counter = 0;
        while (number > 0) {
            counter = counter * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Переворот числа: " + counter);
    }
}
