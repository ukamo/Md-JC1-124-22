package home_work_3.calcs.additional;

import home_work_3.simple.CalculatorWithMathCopy;
import home_work_3.simple.CalculatorWithMathExtends;
import home_work_3.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private int counter = 0;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopyNew;
    private CalculatorWithMathExtends calcExtend;
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calcOper){
        calculatorWithOperator = calcOper;
    }

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathCopy calcul){
        calculatorWithMathCopyNew = calcul;
    }

   public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends calc){
        calcExtend = calc;
    }
    public void incrementCountOperation(){
        counter += 1;
    }
    public long getCountOperation(){
        return counter;
    }

    public double multipleTwoNumbersNew (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithOperator.multipleTwoNumbers(numberOne,numberTwo);
    }
    public double divideTwoNumbersNew (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithOperator.divideTwoNumbers(numberOne,numberTwo);
    };
    public double sumTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithOperator.sumTwoNumbers(numberOne,numberTwo);
    };
    public double subtractionTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithOperator.subtractionTwoNumbers(numberOne,numberTwo);
    };
    public double degreeNumbers(double numberOne, double degree){
        incrementCountOperation();
        return calculatorWithOperator.degreeNumbers(numberOne,degree);
    };
    public double moduleNumbers(double a){
        incrementCountOperation();
        return  calculatorWithOperator.moduleNumbers(a);
    };
    public double squareRoot (double a, int i){
        incrementCountOperation();
        return calculatorWithOperator.squareRoot(a,i);
    }


    public double multipleTwoNumbersNew2 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithMathCopyNew.multipleTwoNumbers(numberOne,numberTwo);
    }
    public double divideTwoNumbersNew2 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithMathCopyNew.divideTwoNumbers(numberOne,numberTwo);
    };
    public double sumTwoNumbers2 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithMathCopyNew.sumTwoNumbers(numberOne,numberTwo);
    };
    public double subtractionTwoNumbers2 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calculatorWithMathCopyNew.subtractionTwoNumbers(numberOne,numberTwo);
    };
    public double degreeNumbers2 (double numberOne, double degree){
        incrementCountOperation();
        return calculatorWithMathCopyNew.degreeNumbers(numberOne,degree);
    };
    public double moduleNumbers2 (double a){
        incrementCountOperation();
        return  calculatorWithMathCopyNew.moduleNumbers(a);
    };
    public double squareRoot2 (double a, int i){
        incrementCountOperation();
        return calculatorWithMathCopyNew.squareRoot(a,i);
    }



    public double multipleTwoNumbersNew3 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calcExtend.multipleTwoNumbers(numberOne,numberTwo);
    }
    public double divideTwoNumbersNew3 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calcExtend.divideTwoNumbers(numberOne,numberTwo);
    };
    public double sumTwoNumbers3 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calcExtend.sumTwoNumbers(numberOne,numberTwo);
    };
    public double subtractionTwoNumbers3 (double numberOne, double numberTwo){
        incrementCountOperation();
        return calcExtend.subtractionTwoNumbers(numberOne,numberTwo);
    };
    public double degreeNumbers3 (double numberOne, double degree){
        incrementCountOperation();
        return calcExtend.degreeNumbers(numberOne,degree);
    };
    public double moduleNumbers3 (double a){
        incrementCountOperation();
        return  calcExtend.moduleNumbers(a);
    };
    public double squareRoot3 (double a, int i){
        incrementCountOperation();
        return calcExtend.squareRoot(a,i);
    }




}
