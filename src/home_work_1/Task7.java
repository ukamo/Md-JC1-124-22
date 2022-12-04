package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Task7 {
public static String createPhoneNumber (int[] array){
        String strPhone =  "(" + array[0]+ array[1]+ array[2] + ") " + array[3] + array[4]+ array[5] +"-" + array[6]+ array[7]+array[8]+ array[9];
        return strPhone;
     };
        @Test
        @Order(1)
        @DisplayName("Тестирование массива - 9 значений")
        public void test1() {
            int arrPhone [] = {1,2,3,4,5,6,7,8,9,0};
            String str1 = createPhoneNumber(arrPhone);
            System.out.println(str1);
    }
}
