package home_work_4.home_work_1;

import home_work_1.Task4exercise1;
import home_work_1.Task4exercise2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Task4exercise2Test {
    private Task4exercise2 testThreeNumbers = new Task4exercise2();
    @Test
    @Order(1)
    @DisplayName("Тестирование положительных чисел")
    public void threeNumbers() {
        String numb1 = testThreeNumbers.threeNumbers(1.0, 2.0, 3.0);
        System.out.println(numb1);
    };
    @Order(2)
    @Test
    @DisplayName("Тестирование 0, отрицательное -13, положительное 16")
    public void threeNumbsWithZero() {
        String numb2 = testThreeNumbers.threeNumbers((double) 0,-13d,16d);
        System.out.println(numb2);
    };
    @Order(3)
    @Test
    @DisplayName("Тестирование чисел с точкой (-123456789.0987654321, 987654321.0,1.023456789)")
    public void threeNumbsWithZeroWithDot() {
        String numb3 = testThreeNumbers.threeNumbers(-123456789.0987654321, 987654321.0,1.023456789);
        System.out.println(numb3);
     }
}
