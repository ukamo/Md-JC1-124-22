package home_work_3.calcs.additional;

import home_work_3.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long counter;
    public void incrementCountOperation(){
        counter += 1;
    }
    public long getCountOperation(){
        return counter;
    }

    @Override
    public double sumTwoNumbers (double numberOne, double numberTwo){
        incrementCountOperation();
        return super.sumTwoNumbers(numberOne, numberTwo);

    }

    @Override
    public double divideTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return super.divideTwoNumbers(numberOne, numberTwo);
    }

    @Override
    public double squareRoot(double a, int i) {
        incrementCountOperation();
        return super.squareRoot(a, i);
    }

    @Override
    public double subtractionTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return super.subtractionTwoNumbers(numberOne, numberTwo);
    }

    @Override
    public double degreeNumbers(double numberOne, double degree) {
        incrementCountOperation();
        return super.degreeNumbers(numberOne, degree);
    }

    @Override
    public double moduleNumbers(double a) {
        incrementCountOperation();
        return super.moduleNumbers(a);
    }

    @Override
    public double multipleTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return super.multipleTwoNumbers(numberOne, numberTwo);
    }
}
