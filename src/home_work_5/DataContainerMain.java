package home_work_5;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        //4.1
      /*
        Integer[] dataArr = new Integer[5];
        dataArr[0] =1;
        dataArr[1] =2;
        dataArr[2] =3;
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number1 = inputNumber1.nextInt();
        int numbPos  = integerDataContainer.add(number1);
        System.out.println("Номер позиции в массиве, начиная с 0 = "+ numbPos);

         */
        //4.1.3
        /* Integer[] dataArr = new Integer[5];
        dataArr[0] =1;
        dataArr[2] =3;
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);
        /*
        int numbPos2  = integerDataContainer.add(null);
        System.out.println("Номер позиции в массиве, начиная с 0 = "+ numbPos2);
         */
        /*
        int numbPos3  = integerDataContainer.add(777);
        System.out.println("Номер позиции в массиве, начиная с 0 = "+ numbPos3);
        */
        //4.2.1
       /* Integer[] dataArr = new Integer[3];
        dataArr[0] =1;
        dataArr[1] =2;
        dataArr[2] =3;
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);
        int numbPos4  = integerDataContainer.add(777);
        System.out.println("Номер позиции в массиве, начиная с 0 = "+ numbPos4);
       */
        //4.2.2,5.1
       /* Integer []dataArr = {};
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);
        int numbPos5  = integerDataContainer.add(777);
        int getNumb = integerDataContainer.get(numbPos5);
        System.out.println("Номер позиции в массиве, начиная с 0 = "+ numbPos5 + "\n" + getNumb);
        */
        //5.2
        /*
        Integer []dataArr = {999};
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);
        Integer getNumb2 = integerDataContainer.get(1);
        System.out.println(getNumb2);
        //6
        System.out.println(Arrays.toString(integerDataContainer.getItems()));
        */
        //7

    //Integer []dataArr = {null,1,2,3,null,777,null, 5};
    //DataContainer<Integer> integerDataContainer;
    //integerDataContainer = new DataContainer<Integer>(dataArr);

            //7.1
       // Boolean getNumb2 = integerDataContainer.delete(3);
            //7.2
       // Boolean getNumb2 = integerDataContainer.delete(9);
            //7.3
        //Boolean getNumb2 = integerDataContainer.delete(2);
        //System.out.println(getNumb2);
        //System.out.println(Arrays.toString(integerDataContainer.getItems()));
            //8.1
        //Boolean getNumb3 = integerDataContainer.deleteItem(null);
            //8.2
        //Boolean getNumb3 = integerDataContainer.deleteItem(777);
            //8.3
       // Boolean getNumb3 = integerDataContainer.delete(111);
       /* Boolean getNumb3 = integerDataContainer.delete(3);
        System.out.println(getNumb3);
        System.out.println(Arrays.toString(integerDataContainer.getItems()));
        */
        //9.1
        /*Integer []dataArr = {3,2,1,777,5};
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);
        integerDataContainer.sort(Integer::compareTo);
        System.out.println(integerDataContainer);
         */
        // 9.2
        String [] dataNew = {"i", "hello", "1", "Как домашка"};
        DataContainer<String> integerDataContainer;
        integerDataContainer = new DataContainer<String>(dataNew);
        integerDataContainer.sort(new StringLengtnComparator());
        System.out.println(integerDataContainer);

        //10
        //String getArr = integerDataContainer.toString();
        //System.out.println(getArr);
    }
}
