package home_work_3.calcs.runners;

import home_work_3.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        //1.1    4.1 + 15 * 7 + (28 / 5) ^ 2.
        double rezDiv2 = calculator.divideTwoNumbers(28,5);
        double rezDegreeNumbers2 = calculator.degreeNumbers (rezDiv2,2 );
        double rezMulti2 = calculator.multipleTwoNumbers(15, 7);
        double rezSum3 = calculator.sumTwoNumbers(4.1, rezMulti2);
        double rezSum4 = calculator.sumTwoNumbers(rezSum3, rezDegreeNumbers2);
        System.out.println(rezSum3);
    }

}
