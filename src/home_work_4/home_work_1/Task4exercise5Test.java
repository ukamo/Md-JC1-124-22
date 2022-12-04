package home_work_4.home_work_1;

import home_work_1.Task4exercise4;
import home_work_1.Task4exercise5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Task4exercise5Test {
    private Task4exercise5 letterOrSymbole = new Task4exercise5();
    @Test
    @Order(1)
    @DisplayName("Тестирование буквы A - 65")
    public void test1() {
        System.out.println(letterOrSymbole.letterIrSymbol(65));
    };
    @Test
    @Order(2)
    @DisplayName("Тестирование буквы Z - 90")
    public void test2() {
        System.out.println(letterOrSymbole.letterIrSymbol(90));
    };
    @Test
    @Order(3)
    @DisplayName("Тестирование символа [ - 91")
    public void test3() {
        System.out.println(letterOrSymbole.letterIrSymbol(91));
    };
    @Test
    @Order(4)
    @DisplayName("Тестирование символа !- 33")
    public void test4() {
        System.out.println(letterOrSymbole.letterIrSymbol(64));
    };
    @Test
    @Order(5)
    @DisplayName("Тестирование символа 127 - вне диапазона ")
    public void test5() {
        System.out.println(letterOrSymbole.letterIrSymbol(127));
    };
    @Test
    @Order(6)
    @DisplayName("Тестирование 32 - вне диапазона")
    public void test6() {
        System.out.println(letterOrSymbole.letterIrSymbol(32));
    };
    @Test
    @Order(7)
    @DisplayName("Тестирование символа ~ -  126")
    public void test7() {
        System.out.println(letterOrSymbole.letterIrSymbol(64));
    };
    @Test
    @Order(8)
    @DisplayName("Тестирование буквы z - 122")
    public void test8() {
        System.out.println(letterOrSymbole.letterIrSymbol(122));
    };
    @Test
    @Order(9)
    @DisplayName("Тестирование буквы a - 97")
    public void test9() {
        System.out.println(letterOrSymbole.letterIrSymbol(97));
    };
    @Test
    @Order(10)
    @DisplayName("Тестирование символа ` - 96")
    public void test10() {
        System.out.println(letterOrSymbole.letterIrSymbol(96));
    };
}
