package home_work_3.calcs.runners;

import home_work_3.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator3 = new CalculatorWithMathExtends();
        //1.1    4.1 + 15 * 7 + (28 / 5) ^ 2.
        double rezDiv3 = calculator3.divideTwoNumbers(28,5);
        double rezDegreeNumbers3 = calculator3.degreeNumbers (rezDiv3,2 );
        double rezMulti3 = calculator3.multipleTwoNumbers(15, 7);
        double rezSum5 = calculator3.sumTwoNumbers(4.1, rezMulti3);
        double rezSum6 = calculator3.sumTwoNumbers(rezSum5, rezDegreeNumbers3);
        System.out.println(rezSum6);
    }
}
