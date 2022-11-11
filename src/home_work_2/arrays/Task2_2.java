package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class Task2_2 {
    public static void main(String[] args) {
     //   int[] containerArrayFromConsole = ArraysUtils.arrayFromConsole();
       // allElementsInConsole (containerArrayFromConsole);
       // eachSecondElementInConsole(containerArrayFromConsole);
      //allElementsInConsoleRevers (containerArrayFromConsole);


      //int [] containerTest = {3,55,5,-6,7};
        //allElementsInConsoleRevers (containerTest);
    }
    public static void allElementsInConsole (int[] array) {
        int n = 0;
    //with do-while
  /*      do{
            System.out.println("Элемент массива " + (n + 1) + " равен: "  + array [n]);
            n++;

        } while (n < array.length);
  */
    // with while
 /*        while (n < array.length){
            System.out.println("Элемент массива " + (n + 1) + " равен: "  + array [n]);
            n++;
        };
 */
    // with for
 /*       for ( ;n < array.length; n++){
            System.out.println("Элемент массива " + (n + 1) + " равен: "  + array [n]);
        }
 */
    //with foreach
        for ( int i: array) {
            System.out.println("Элемент массива " + (n + 1) + " равен: "  + i);
            n++;
        }

    }

    public static void eachSecondElementInConsole (int[] array) {
        int n = 0;
        //       with do-while
 /*       do{
            if(n % 2 != 0) {
                System.out.println("Элемент массива " + (n + 1) + " равен: " + array[n]);
            }
            n++;
        } while (n < array.length);
    */
        // with while
 /*       while (n < array.length) {
            if (n % 2 != 0) {
                System.out.println("Элемент массива " + (n + 1) + " равен: " + array[n]);
            }
            n++;
        }*/
        // with for
 /*       for (int i = 1;i < array.length; i+=2){
            System.out.println("Элемент массива " + (i) + " равен: " + array[i]);
            }*/
        // with foreach
       for ( int i: array) {
           if (n % 2 != 0) {
               System.out.println("Элемент массива " + (n + 1) + " равен: " + i);
           }
           n++;
       }
    };
    public static void allElementsInConsoleRevers (int[] array){
        int n = array.length-1;
        //with do-while
/*
        do{
            System.out.println("Элемент массива " + (n) + " равен: "  + array [n]);
            n--;
        } while (n >=0);
*/


       // with while
 /*        while (n >=0){
            System.out.println("Элемент массива " + (n) + " равен: "  + array [n]);
            n--;
        };*/

        // with for
  /*      for ( ;n>=0; n--){
            System.out.println("Элемент массива " + (n) + " равен: "  + array [n]);
        }*/

        //with foreach
        int[] arrayReverse;
        int j = array.length;
        arrayReverse = new int[j];
        for (int i = 0; i <= n; i++) {
           arrayReverse[j - 1] = array[i];
            j = j - 1;
        }
        for ( int i : arrayReverse) {
            System.out.println("Элемент массива " + (n) + " равен: "  + i);
            n--;
        }

    }

}
