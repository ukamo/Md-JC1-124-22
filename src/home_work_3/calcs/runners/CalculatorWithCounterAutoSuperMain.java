package home_work_3.calcs.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator5 = new CalculatorWithCounterAutoSuper ();
        double rezDiv3 = calculator5.divideTwoNumbers(28,5);
        double rezDegreeNumbers3 = calculator5.degreeNumbers (rezDiv3,2 );
        double rezMulti3 = calculator5.multipleTwoNumbers(15, 7);
        double rezSum5 = calculator5.sumTwoNumbers(4.1, rezMulti3);
        double rezSum6 = calculator5.sumTwoNumbers(rezSum5, rezDegreeNumbers3);
        System.out.println(rezSum6);
        System.out.println(calculator5.getCountOperation());
    }
}
