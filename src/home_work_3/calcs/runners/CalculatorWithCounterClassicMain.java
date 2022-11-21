package home_work_3.calcs.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator4 = new CalculatorWithCounterClassic();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double rezDiv3 = calculator4.divideTwoNumbers(28,5);
        calculator4.incrementCountOperation();
        double rezDegreeNumbers3 = calculator4.degreeNumbers (rezDiv3,2 );
        calculator4.incrementCountOperation();
        double rezMulti3 = calculator4.multipleTwoNumbers(15, 7);
        calculator4.incrementCountOperation();
        double rezSum5 = calculator4.sumTwoNumbers(4.1, rezMulti3);
        calculator4.incrementCountOperation();
        double rezSum6 = calculator4.sumTwoNumbers(rezSum5, rezDegreeNumbers3);
        calculator4.incrementCountOperation();
        System.out.println(rezSum6);
        System.out.println(calculator4.getCountOperation());
    }
}
