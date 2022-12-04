package home_work_4.home_work_1;

import home_work_1.Task4exercise3;
import home_work_1.Task4exercise4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Task4exercise4Test {
    private Task4exercise4 ByteOrKilobyte = new Task4exercise4();
    @Test
    @Order(1)
    @DisplayName("Тестирование положительных чисел + в байты (true)")
    public void NumbAndTrue() {
        System.out.println(ByteOrKilobyte.ByteOrKilobyte(20d,true));
    };

    @Test
    @Order(2)
    @DisplayName("Тестирование положительных чисел + в килобайты (false)")
    public void NumbAndFalse() {
        System.out.println(ByteOrKilobyte.ByteOrKilobyte(1d,false ));
    };

    @Test
    @Order(3)
    @DisplayName("Тестирование 0 + в байты (true)")
    public void test3() {
        System.out.println(ByteOrKilobyte.ByteOrKilobyte(0d,true));
    };

    @Test
    @Order(4)
    @DisplayName("Тестирование 0 + в килобайты (true)")
    public void NumbsAndFalse() {
        System.out.println(ByteOrKilobyte.ByteOrKilobyte(0d,false));
    };

    @Test
    @Order(5)
    @DisplayName("Тестирование отрицательных дробных чисел + в байты (true)")
    public void test4() {
        System.out.println(ByteOrKilobyte.ByteOrKilobyte(-1000000.0001,true ));
    };

    @Test
    @Order(6)
    @DisplayName("Тестирование отрицательных дробных чисел + в килобайты (false)")
    public void test5() {
        System.out.println(ByteOrKilobyte.ByteOrKilobyte(-987654321.0912345,false ));
    };

}
