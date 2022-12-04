package home_work_4.home_work_2;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test

    @DisplayName ("Проверка конкретного размера")
    @Order(0)
    public void arrayRandom1() {

        int[] ints = ArraysUtils.arrayRandom(10, 20);
        Assertions.assertEquals(10, ints.length);
         }

    public void arrayRandom2() {
        int[] ints = ArraysUtils.arrayRandom(10, 20);
        for (int element : ints){
            Assertions.assertTrue(element <20);
        }
    }
    public void arrayRandom3() {
        int[] ints = ArraysUtils.arrayRandom(0, 20);
        Assertions.assertEquals(0, ints.length);
    }
}
