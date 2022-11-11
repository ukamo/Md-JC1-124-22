package home_work_2.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    // arrayFromConsole();
    public static int[] arrayFromConsole() {
        System.out.print("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int sizeFromUser = input.nextInt();
        int[] containerArray = new int[sizeFromUser];
        //System.out.print(containerArray.length);
        int numbFromUser;
        for (int i = 0; i < containerArray.length; i++) {
            System.out.print("Введите число: ");
            numbFromUser = input.nextInt();
            containerArray[i] = numbFromUser;
        }
        // System.out.print(Arrays.toString(containerArray));
        return containerArray;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] containerRandom = new int[size];
        for (int i = 0; i < containerRandom.length; i++) {
            int min = 0;
            int max = maxValueExclusion;
            int diff = max - min;
            Random rand = new Random();
            int numb = rand.nextInt(diff + 1);
            containerRandom[i] = numb;

        }
        // System.out.print(Arrays.toString(containerRandom));
        return containerRandom;
    }
}
