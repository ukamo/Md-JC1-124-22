package home_work_6.mains;

import home_work_6.EasySearch;
import home_work_6.ReaderChange;

public class MainExercise3_5 {
    public static void main(String[] args) {
        EasySearch easySearch1 = new EasySearch();
        ReaderChange readChange = new ReaderChange();
        String content = readChange.readFile("Война и мир_книга.txt").toString();
        long count = easySearch1.search(content, "война");
        System.out.println("война" + count);
        long count11 = easySearch1.search(content, "Война");
        System.out.println("Война" + count11);
        long count2 = easySearch1.search(content, "и");
        System.out.println("и" + count2);
        long count3 = easySearch1.search(content, "мир");
        System.out.println("мир" + count3);

    }
}
