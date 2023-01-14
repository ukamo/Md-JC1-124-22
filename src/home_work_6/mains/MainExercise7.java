package home_work_6.mains;

import home_work_6.WorkingWithFiles;

import java.util.Scanner;

public class MainExercise7 {
    public static void main(String[] args) {
        WorkingWithFiles wwf = new WorkingWithFiles();
        Scanner inputPath = new Scanner(System.in);
        System.out.print("Передайте путь: ");
        String number1 = inputPath.next();
        wwf.readerDir(number1);
    }
}
