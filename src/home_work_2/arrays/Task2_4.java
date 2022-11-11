package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        int[] array2_4 = ArraysUtils.arrayRandom(8, 20);
        System.out.print(Arrays.toString(array2_4) + "\n");
        //task 2.4.1
       /* int rezFromArraySum = arraySum(array2_4);
        System.out.print(rezFromArraySum);*/
        //task 2.4.2
        /*int maxEl = maxEvenElement(array2_4);
        System.out.print(maxEl);*/
        // task  2.4.3
       /* int[] maxArithmetical = maxArithmeticalMean(array2_4);
        System.out.print(Arrays.toString(maxArithmetical) + "\n");*/
        // task 2.4.4
        //int[] minTwoElements = minimalTwoElementsInArray(array2_4);
        // task 2.4.5
        /*int[] compArray = compressArray(array2_4);
        System.out.print(Arrays.toString(compArray) + "\n");*/
        //2.4.6
        int sumNumb = summNumbers(array2_4);
        System.out.print("Сумма чисел в массиве: "+ sumNumb + "\n");
    }

    public static int arraySum(int[] array) {
        int summPozitiveNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] > 0) {
                summPozitiveNumbers += 1;
            }
        }
        return summPozitiveNumbers;
    }

    public static int maxEvenElement(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i += 2) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] maxArithmeticalMean(int[] array) {
        int sumArray = 0;
        int countSize = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        int arithmeticalMean = sumArray / array.length;
        //System.out.println(arithmeticalMean);
        for (int i = 0; i < array.length; i++) {
            if (arithmeticalMean > array[i]) {
                countSize += 1;
            }
        }
        int[] newArray = new int[countSize];
        for (int i = 0, y = 0; i < array.length; i++) {
            if (arithmeticalMean > array[i]) {
                newArray[y] = array[i];
                y++;
            }
        }
        return newArray;
    }

    public static int[] minimalTwoElementsInArray(int[] array) {
        int min1 = 0;
        int min2 = 0;
        int addCounter = 0;
        for (int i = 0; i < 1; i++) {
            if (array[i] < array[i + 1]) {
                min1 = array[i];
                min2 = array[i + 1];
            } else {
                min1 = array[i + 1];
                min2 = array[i];
            }
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < min1) {
                addCounter = min1;
                min1 = array[i];
            } else if (addCounter < min2) {
                min2 = addCounter;
            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }
        System.out.print("2 наименьших значения: " + min1 + " и " + min2);
        return new int[]{min1, min2};

    }

    public static int[] compressArray(int[] array) {
        System.out.print("Введите нижний диапазон: ");
        Scanner input = new Scanner(System.in);
        int minRange = input.nextInt();
        System.out.print("Введите верхний диапазон: ");
        int maxRange = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= minRange && array[i] <= maxRange) {
                array[i] = 0;
            }
        }
        int k = 0;
        for (int i : array) {
            if (i != 0) {
                array[k++] = i;
            }
        }
        for (int i = k; i < array.length; i++) {
            array[i] = 0;
        }
        // System.out.print(Arrays.toString(array));
        return array;

    }
    public static int summNumbers(int[] array) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
        }
        return sum;
    }
}

