package home_work_1;

public class Task4exercise2 {
    public String threeNumbers (Double numberSave1, Double numberSave2, Double numberSave3) {
        if (numberSave1 > numberSave2 && numberSave1 < numberSave3 || numberSave1 < numberSave2 && numberSave1 > numberSave3 ){
            String rez1 = "Первое число " + numberSave1 + "- это среднее число";
            return rez1;
        } else if (numberSave2 > numberSave1 && numberSave2 < numberSave3 || numberSave2 < numberSave1 && numberSave2 > numberSave3) {
            String rez2 ="Второе число " + numberSave2 + "- это среднее число";
            return rez2;
        } else if (numberSave3 > numberSave1 && numberSave3 < numberSave2 || numberSave3 < numberSave1 && numberSave3 > numberSave2) {
            String rez3 = "Третье число " + numberSave3 + "- это среднее число";
            return rez3;
        }
        String rez4 = "Incorrect data";
        return rez4;
    }

}

/*
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int numberSave1 = inputNumber.nextInt();

        System.out.print("Input a number 2: ");
        int numberSave2 = inputNumber.nextInt();

        System.out.print("Input a number 3: ");
        int numberSave3 = inputNumber.nextInt();

        if (numberSave1 > numberSave2 && numberSave1 < numberSave3 || numberSave1 < numberSave2 && numberSave1 > numberSave3 ){
            System.out.print("Result: the first number is " + numberSave1);
        } else if (numberSave2 > numberSave1 && numberSave2 < numberSave3 || numberSave2 < numberSave1 && numberSave2 > numberSave3) {
            System.out.print("Result: the second number is " + numberSave2);
        } else if (numberSave3 > numberSave1 && numberSave3 < numberSave2 || numberSave3 < numberSave1 && numberSave3 > numberSave2) {
            System.out.print("Result: the third number is " + numberSave3);
            //можно оставить с else, но так можно быстрее дополнить этот код, в случае необходимости
        }
    }
    */