package home_work_3.calcs.runners;

import home_work_3.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        //1.1    4.1 + 15 * 7 + (28 / 5) ^ 2.

        double rezDiv = calc.divideTwoNumbers(28,5);
        double rezDegreeNumbers = calc.degreeNumbers (rezDiv,2 );
        double rezMulti = calc.multipleTwoNumbers(15, 7);
        double rezSum1 = calc.sumTwoNumbers(4.1, rezMulti);
        double rezSum2 = calc.sumTwoNumbers(rezSum1, rezDegreeNumbers);
        System.out.println(rezSum2);

    }
}
