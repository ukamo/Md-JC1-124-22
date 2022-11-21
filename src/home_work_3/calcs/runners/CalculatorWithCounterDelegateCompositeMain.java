package home_work_3.calcs.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite newAutoComposite = new CalculatorWithCounterAutoComposite();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double rezDiv4 = newAutoComposite.divideTwoNumbersNew(28,5);
        double rezDegreeNumbers3 = newAutoComposite.degreeNumbers (rezDiv4,2 );
        double rezMulti4 = newAutoComposite.multipleTwoNumbersNew(15, 7);
        double rezSum4 = newAutoComposite.sumTwoNumbers(4.1, rezMulti4);
        double rezSum5 = newAutoComposite.sumTwoNumbers(rezSum4, rezDegreeNumbers3);
        System.out.println(rezSum5);
        System.out.println(newAutoComposite.getCountOperation());
    }
}
