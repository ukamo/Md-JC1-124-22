package home_work_4.home_work_1;

import home_work_1.Task6_1;
import home_work_1.Task6_2;
import home_work_1.Task6_3;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.*;

import java.util.Objects;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Task6Test {
    //private ICommunicationPrinter task6_1= new Task6_1();
    private ICommunicationPrinter[] array1 = {new Task6_1(), new Task6_2(), new Task6_3()};

    @Test
    @Order(1)
    @DisplayName("Тестирование имени Юля - Добрый день, а вы кто? 3 раза ")
    public void test1() {
        for (ICommunicationPrinter i : array1) {
            String str1 = i.welcom("Юля");
            System.out.println(str1);
        }
    };


    @Test
    @Order(2)
    @DisplayName("Тестирование имени Вася -Привет! \n Я тебя так долго ждал - 3 раза")
    public void test2() {
        for (ICommunicationPrinter i : array1) {
            String str1 = i.welcom("Вася");
            System.out.println(str1);
        }
    };

    @Test
    @Order(3)
    @DisplayName("Тестирование имени Анастасия - Я тебя так долго ждал - 3 раза")
    public void test3() {
        for (ICommunicationPrinter i : array1) {
            String str1 = i.welcom("Анастасия");
            System.out.println(str1);
        }
    };

}