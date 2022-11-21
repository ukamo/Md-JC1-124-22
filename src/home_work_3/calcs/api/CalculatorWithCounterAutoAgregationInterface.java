package home_work_3.calcs.api;

public class CalculatorWithCounterAutoAgregationInterface {
    private int counter = 0;
    private ICalculator iCalc;
    public CalculatorWithCounterAutoAgregationInterface (ICalculator iCalc){
        this.iCalc = iCalc;
    }

    public void incrementCountOperation(){
        counter += 1;
    }
    public long getCountOperation(){
        return counter;
    }

    public double multipleTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return iCalc.multipleTwoNumbers(numberOne,numberTwo);
    }

    public double divideTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return iCalc.divideTwoNumbers(numberOne,numberTwo);
    }

    public double sumTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return iCalc.sumTwoNumbers(numberOne,numberTwo);
    }

    public double subtractionTwoNumbers(double numberOne, double numberTwo) {
        incrementCountOperation();
        return iCalc.subtractionTwoNumbers(numberOne,numberTwo);
    }

    public double degreeNumbers(double numberOne, double degree) {
        incrementCountOperation();
        return iCalc.degreeNumbers(numberOne,degree);
    }
    public double moduleNumbers(double a) {
        incrementCountOperation();
        return iCalc.moduleNumbers(a);
    }

    public double squareRoot(double a, int i) {
        incrementCountOperation();
        return iCalc.squareRoot(a, i);
    }


}
