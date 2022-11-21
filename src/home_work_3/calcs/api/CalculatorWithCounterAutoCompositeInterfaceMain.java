package home_work_3.calcs.api;

import home_work_3.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculInter =
                new CalculatorWithCounterAutoAgregationInterface(calcCopy);
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double rezDiv3 = calculInter.divideTwoNumbers(28,5);
        double rezDegreeNumbers3 = calculInter.degreeNumbers (rezDiv3,2 );
        double rezMulti3 = calculInter.multipleTwoNumbers(15, 7);
        double rezSum5 = calculInter.sumTwoNumbers(4.1, rezMulti3);
        double rezSum6 = calculInter.sumTwoNumbers(rezSum5, rezDegreeNumbers3);
        System.out.println(rezSum6);
        System.out.println(calculInter.getCountOperation());

    }
}
