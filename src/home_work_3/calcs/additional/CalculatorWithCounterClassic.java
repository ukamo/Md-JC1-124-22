package home_work_3.calcs.additional;

import home_work_3.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long counter = 0;
    public void incrementCountOperation(){
        counter += 1;
    }

    public long getCountOperation(){
        return counter;
    }
}
