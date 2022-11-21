package home_work_3.calcs.additional;

import home_work_3.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithMathCopy calculator7;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator){
        calculator7 = calculator;
    }
    int counter = 0;
    public void incrementCountOperation(){
        counter += 1;
    }

    public long getCountOperation(){
        return counter;
    }

    public double multipleTwoNumbersNew (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator7.multipleTwoNumbers(numberOne,numberTwo);
    }
    public double divideTwoNumbersNew (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator7.divideTwoNumbers(numberOne,numberTwo);
    };
    public double sumTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator7.sumTwoNumbers(numberOne,numberTwo);
    };
    public double subtractionTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator7.subtractionTwoNumbers(numberOne,numberTwo);
    };
    public double degreeNumbers(double numberOne, double degree){
        incrementCountOperation();
        return calculator7.degreeNumbers(numberOne,degree);
    };
    public double moduleNumbers(double a){
        incrementCountOperation();
        return  calculator7.moduleNumbers(a);
    };
    public double squareRoot (double a, int i){
        incrementCountOperation();
        return calculator7.squareRoot(a,i);
    }

}
