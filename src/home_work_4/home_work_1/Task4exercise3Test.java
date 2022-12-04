package home_work_4.home_work_1;

import home_work_1.Task4exercise2;
import home_work_1.Task4exercise3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Task4exercise3Test  {
    private Task4exercise3 testTwoNumbers = new Task4exercise3();
    @Test
    @Order(1)
    @DisplayName("Тестирование положительных чисел")
    public void twoNumbers() {
        String numb1 = testTwoNumbers.DivideTwoNumbers(20.0, 3.0);
        System.out.println(numb1);
    };
    @Order(2)
    @Test
    @DisplayName("Тестирование на 0")
    public void twoNumbsWithZero() {
        String numb2 = testTwoNumbers.DivideTwoNumbers(19d, (double) 0);
        System.out.println(numb2);
    };
    @Order(3)
    @Test
    @DisplayName("0 делим на число")
    public void twoNumbsWithZeroDivide() {
        String numb3 = testTwoNumbers.DivideTwoNumbers((double)0, 123456789d);
        System.out.println(numb3);
    }
    @Order(4)
    @Test
    @DisplayName("Тестирование чисел с точкой  и отрицательных (-123456789.0987654321,,1.023456789)")
    public void twoNumbsWithZeroWithDot() {
        String numb3 = testTwoNumbers.DivideTwoNumbers(-123456789.0987654321, -987654321.0);
        System.out.println(numb3);
    }
}
