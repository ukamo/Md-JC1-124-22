package home_work_3.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double degreeNumbers(double numberOne, double degree){
        return Math.pow(numberOne,degree);
    };
    public double moduleNumbers(double a){
        return  Math.abs(a);
    };

}
