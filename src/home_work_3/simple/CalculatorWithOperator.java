package home_work_3.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double multipleTwoNumbers (double numberOne, double numberTwo){
        double rezMultipleTwoNumbers = numberOne * numberTwo;
        return rezMultipleTwoNumbers;
    }
    public double divideTwoNumbers (double numberOne, double numberTwo){
        double rezDivideTwoNumbers = numberOne / numberTwo;
        return rezDivideTwoNumbers;
    };
    public double sumTwoNumbers (double numberOne, double numberTwo){
        double rezSumTwoNumbers = numberOne + numberTwo;
        return rezSumTwoNumbers;
    };
    public double subtractionTwoNumbers (double numberOne, double numberTwo){
        double rezSubtractionTwoNumbers = numberOne - numberTwo;
        return rezSubtractionTwoNumbers;
    };

    public double degreeNumbers(double numberOne, double degree){
        double rezNumberOne = 1;
        for (int i =1; i<= degree; i++){
            rezNumberOne = rezNumberOne * numberOne;
        }
        //System.out.println(rezNumberOne);
        return rezNumberOne;
    };

    public double moduleNumbers(double a){
        if (a < 0){
            return -a;
        }
        return a;
    };
        public double squareRoot (double a, int i){
        return Math. sqrt(a);
        }



}
