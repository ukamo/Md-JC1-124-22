package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;


public class SortsMain {
    public static void main(String[] args) {
        // exercise 4.2.1 - Bubble
        int[] testArray1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] sortTestArray1 = SortsUtils.sortBubbleMetod(testArray1);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray1) + ". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray1) + "\n");
        int[] testArray2 = new int[]{1, 1, 1, 1};
        int[] sortTestArray2 = SortsUtils.sortBubbleMetod(testArray2);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray2) + ". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray2) + "\n");
        int[] testArray3 = new int[]{9, 1, 5, 99, 9, 9};
        //System.out.print("Был массив ДО: " + Arrays.toString(testArray3) + ".");
        int[] sortTestArray3 = SortsUtils.sortBubbleMetod(testArray3);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray3) + "." + "Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray3) + ".\n");
        int[] testArray4 = new int[]{};
        int[] sortTestArray4 = SortsUtils.sortBubbleMetod(testArray4);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray4) + ". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray4) + ".\n");
        int[] testArray5 = new int[]{6, 5, 4, 3, 2, 1};
        int[] sortTestArray5 = SortsUtils.sortBubbleMetod(testArray5);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray5) + ". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray5) + ".\n");
        // exercise 4.2.2 - Bubble
        int[] testArray6 = ArraysUtils.arrayRandom(50, 100);
        int[] sortTestArray6 = SortsUtils.sortBubbleMetod(testArray6);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray6) + ". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray6) + ".\n");
        // exercise 4.2.3 - Bubble
        int[] testArray7 = ArraysUtils.arrayFromConsole();
        int[] sortTestArray7 = SortsUtils.sortBubbleMetod(testArray7);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray7) + ". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray7) + ".\n");

        // exercise 4.2.1 - Shaker
        int[] testArray8 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print("Был массив ДО: " + Arrays.toString(testArray8) + ". ");
        int[] sortTestArray8 = SortsUtils.sortShakerMetod(testArray8);
        System.out.print(". Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray8) + "\n");
        int[] testArray9 = new int[]{1, 1, 1, 1};
        System.out.print("Был массив ДО: " + Arrays.toString(testArray9) + ". ");
        int[] sortTestArray9 = SortsUtils.sortShakerMetod(testArray9);
        System.out.print("Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray9) + "\n");
        int[] testArray10 = new int[]{9, 1, 5, 99, 9, 9};
        System.out.print("Был массив ДО: " + Arrays.toString(testArray10) + ". ");
        int[] sortTestArray10 = SortsUtils.sortShakerMetod(testArray10);
        System.out.print("Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray10) + ".\n");
        int[] testArray11 = new int[]{};
        System.out.print("Был массив ДО: " + Arrays.toString(testArray11) + ". ");
        int[] sortTestArray11 = SortsUtils.sortShakerMetod(testArray11);
        System.out.print("Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray11) + ".\n");
        int[] testArray12 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.print("Был массив ДО: " + Arrays.toString(testArray12) + ". ");
        int[] sortTestArray12 = SortsUtils.sortShakerMetod(testArray12);
        System.out.print("Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray12) + ".\n");
        // exercise 4.2.2 - Shaker
        int[] testArray13 = ArraysUtils.arrayRandom(50, 100);
        System.out.print("Был массив ДО: " + Arrays.toString(testArray13) + ". ");
        int[] sortTestArray13 = SortsUtils.sortShakerMetod(testArray13);
        System.out.print("Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray13) + ".\n");
        // exercise 4.2.3 - Shaker
        int[] testArray14 = ArraysUtils.arrayFromConsole();
        System.out.print("Был массив ДО: " + Arrays.toString(testArray14) + ". ");
        int[] sortTestArray14 = SortsUtils.sortShakerMetod(testArray14);
        System.out.print("Стал ПОСЛЕ сортировки: " + Arrays.toString(sortTestArray14) + ".\n");
    }
}
