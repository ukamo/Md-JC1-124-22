package home_work_3.calcs.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy ();
        CalculatorWithCounterAutoAgregation calculatorAgregat = new CalculatorWithCounterAutoAgregation(calculator);
        double rezDivide = calculatorAgregat.divideTwoNumbersNew(28,5);
        double rezDegreeNumbers = calculatorAgregat.degreeNumbers (rezDivide,2 );
        double rezMulti = calculatorAgregat.multipleTwoNumbersNew(15, 7);
        double rezSumOne = calculatorAgregat.sumTwoNumbers(4.1, rezMulti);
        double rezSumTwo = calculatorAgregat.sumTwoNumbers(rezSumOne, rezDegreeNumbers);
        System.out.println(rezSumTwo);
        System.out.println(calculatorAgregat.getCountOperation());
    }
}
