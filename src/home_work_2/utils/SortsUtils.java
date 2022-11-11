package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {
    public static void main(String[] args) {
        //    int[] containerTest = {3, 55, 5, -6, 7};
        //   int[] containerSorts = sortBubbleMetod(containerTest);
        //   int[] containerShaker = sortShakerMetod(containerTest);

    }

    public static int[] sortBubbleMetod(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int n = (newArray.length - 1); n > i; n--) {
                if (newArray[n - 1] > newArray[n]) {
                    int temp = newArray[n - 1];
                    newArray[n - 1] = newArray[n];
                    newArray[n] = temp;
                }
            }
        }
        //System.out.print(Arrays.toString(newArray));
        return newArray;

    }

    public static int[] sortShakerMetod(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while ((left < right)) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) // если следующий элемент меньше текущего,
                {             // меняем их местами
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
            right--;
            for (int i = right; i > left; i--)  //двигаемся справа налево
            {
                if (arr[i - 1] > arr[i]) // если предыдущий элемент больше текущего,
                {            // меняем их местами
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;
                }
            }
            left++; // сдвигаем левую границу на следующий элемент
        }
        // System.out.print(Arrays.toString(arr));
        return arr;
    }
}