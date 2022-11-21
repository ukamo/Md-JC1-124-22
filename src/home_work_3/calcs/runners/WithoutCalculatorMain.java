package home_work_3.calcs.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        //1.1    4.1 + 15 * 7 + (28 / 5) ^ 2.
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double t = 2;
        double rezMultiplication1 = b * 7;
        double rezDivide1 = d / e;
        double rezDegree1 = Math.pow(rezDivide1, 2);
        double rezExpression1 = a + rezMultiplication1 + rezDegree1;
        System.out.println(rezExpression1);

    }

}
