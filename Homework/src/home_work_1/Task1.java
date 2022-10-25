package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
   //1.2 Использовать побитовые И и ИЛИ с двумя числами введёнными через консоль.
     public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        // двоичный код первого числа 3 = 11
        int numberSave1 = inputNumber1.nextInt();
        Scanner inputNumber2 = new Scanner(System.in);
        System.out.print("Input a number 2: ");
        // двоичный код второго числа 5 = 101
        int numberSave2 = inputNumber2.nextInt();
        int saveByteAndResult = numberSave1&numberSave2;
        System.out.println(saveByteAndResult);
        //двоичный код результата с & 1 = в двоичном 01
        int saveByteOrResult = numberSave1|numberSave2;
        System.out.println(saveByteOrResult);
        // двоичный код результата = 7 в двоичном 111
    }
}

//1.4 Попробуйте сделать побитовую операцию с числом 42.5, опишите результат в комментариях в классе с заданием.
/*
	42.5
целая часть - 42
42/2 = 21 = 0
21/2 = 10= 1
10/2 = 5 = 0
5/2 = 2 = 1
2/ 2 = 1 = 0
1/2 = 0	 = 1

записываем с конца - 101010
считаем дробную 0.5
0.5*2 = 1
(целая часть 1)
0*2 = 0
(целая часть 0)
0*2 = 0
(целая часть 0)
0*2 = 0
(целая часть 0)
дробная часть - 1000
Итого 42.5 = 101010. 1000 */
