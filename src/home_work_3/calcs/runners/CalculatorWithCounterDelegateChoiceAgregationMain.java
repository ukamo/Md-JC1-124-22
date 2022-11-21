package home_work_3.calcs.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.simple.CalculatorWithMathCopy;
import home_work_3.simple.CalculatorWithMathExtends;
import home_work_3.simple.CalculatorWithOperator;


public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperatorNew = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calChoiceAgregationWithOperator = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperatorNew);
        double rezDivide1 = calChoiceAgregationWithOperator.divideTwoNumbersNew(28,5);
        double rezDegreeNumbers1 = calChoiceAgregationWithOperator.degreeNumbers (rezDivide1,2 );
        double rezMulti1 = calChoiceAgregationWithOperator.multipleTwoNumbersNew(15, 7);
        double rezSumOne1 = calChoiceAgregationWithOperator.sumTwoNumbers(4.1, rezMulti1);
        double rezSumTwo1 = calChoiceAgregationWithOperator.sumTwoNumbers(rezSumOne1, rezDegreeNumbers1);
        System.out.println(rezSumTwo1);
        System.out.println(calChoiceAgregationWithOperator.getCountOperation());

        CalculatorWithMathCopy caclCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calChoiceMathCopy = new CalculatorWithCounterAutoChoiceAgregation (caclCopy);
        double rezDivide2 = calChoiceMathCopy.divideTwoNumbersNew(28,5);
        double rezDegreeNumbers2 = calChoiceMathCopy.degreeNumbers (rezDivide2,2 );
        double rezMulti2 = calChoiceMathCopy.multipleTwoNumbersNew(15, 7);
        double rezSumOne2 = calChoiceMathCopy.sumTwoNumbers(4.1, rezMulti2);
        double rezSumTwo2 = calChoiceMathCopy.sumTwoNumbers(rezSumOne2, rezDegreeNumbers2);
        System.out.println(rezSumTwo2);
        System.out.println(calChoiceMathCopy.getCountOperation());

        CalculatorWithMathExtends caclExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calExtendsCopy = new CalculatorWithCounterAutoChoiceAgregation (caclExtends);

        double rezDivide3 = calExtendsCopy.divideTwoNumbersNew(28,5);
        double rezDegreeNumbers3 = calExtendsCopy.degreeNumbers (rezDivide3,2 );
        double rezMulti3 = calExtendsCopy.multipleTwoNumbersNew(15, 7);
        double rezSumOne3 = calExtendsCopy.sumTwoNumbers(4.1, rezMulti3);
        double rezSumTwo3 = calExtendsCopy.sumTwoNumbers(rezSumOne3, rezDegreeNumbers3);
        System.out.println(rezSumTwo3);
        System.out.println(calExtendsCopy.getCountOperation());
    }
}
