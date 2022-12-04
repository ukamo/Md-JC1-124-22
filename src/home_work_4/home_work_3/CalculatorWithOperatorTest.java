package home_work_4.home_work_3;

import home_work_3.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithOperatorTest {
    private CalculatorWithOperator calculator = new CalculatorWithOperator();
    @Test
    public void add(){

        //Assertions.assertEquals(2, calculator.sumTwoNumbers(1,1));
        double result1 = calculator.sumTwoNumbers(1,1);
        // Assertions.assertEquals(3, result1);
    }

}
