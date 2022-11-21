package home_work_3.calcs.additional;

import home_work_3.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    int counter = 0;
    CalculatorWithMathCopy calculator6 = new CalculatorWithMathCopy();

    public void incrementCountOperation(){
        counter += 1;
    }

    public long getCountOperation(){
        return counter;
    }



    public double multipleTwoNumbersNew (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator6.multipleTwoNumbers(numberOne,numberTwo);
    }


    public double divideTwoNumbersNew (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator6.divideTwoNumbers(numberOne,numberTwo);
    };
    public double sumTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator6.sumTwoNumbers(numberOne,numberTwo);
    };
    public double subtractionTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculator6.subtractionTwoNumbers(numberOne,numberTwo);
    };

    public double degreeNumbers(double numberOne, double degree){
        incrementCountOperation();
        return calculator6.degreeNumbers(numberOne,degree);
    };

    public double moduleNumbers(double a){
        incrementCountOperation();
        return  calculator6.moduleNumbers(a);
    };
    public double squareRoot (double a, int i){
        incrementCountOperation();
        return calculator6.squareRoot(a,i);
    }

}
