package home_work_2.loops;

public class Task1_6 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        int number1;
        int startNumb = 2;
        int maxNumb = 9;
        int averageNumb = 5;
        int newTabNumb = 6;
        int rez = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            for (number1 = startNumb; number1 <= averageNumb; number1++) {
                rez = number1 * i;
                String rezult3 = number1 + " * " + i + " = " + rez;
                if (rezult3.length() == 9) {
                    System.out.print(number1 + " * " + i + " = " + rez + "   ");
                } else if (rezult3.length() == 10) {
                    System.out.print(number1 + " * " + i + " = " + rez + "  ");
                } else if (rezult3.length() == 11) {
                    System.out.print(number1 + " * " + i + " = " + rez + " ");
                }
            }
            System.out.println();
        }
        for (i = 1; i <= 10; i++) {
            for (number1 = newTabNumb; number1 <= maxNumb; number1++) {
                rez = number1 * i;
                String rezult4 = number1 + " * " + i + " = " + rez;
                if (rezult4.length() == 9) {
                    System.out.print(number1 + " * " + i + " = " + rez + "   ");
                } else if (rezult4.length() == 10) {
                    System.out.print(number1 + " * " + i + " = " + rez + "  ");
                } else if (rezult4.length() == 11) {
                    System.out.print(number1 + " * " + i + " = " + rez + " ");
                }
            }
            System.out.println();
        }
        System.out.print("ЭТО  \nНУЖНО \nЗНАТЬ!");
    }
}
