package home_work_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataTest {
    @Test
    public void addOneElementToEmptyArray(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);
        container.add(1);
    }

    @Test
    public void addOneElementToArrayWithSize1(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[1]);
        container.add(1);
    }

    @Test
    public void addOneElementToArrayWithSize2(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[2]);
        container.add(99);
        Assertions.assertEquals(99, container.get(0));
    }

    @Test
    public void addOneElementToArrayRepeat(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[2]);
        container.add(99);
        container.add(100);
        Assertions.assertEquals(100, container.get(1));
    }

    @Test
    public void addOneElementToArrayRepeat2(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[3]);
        container.add(99);
        container.add(100);
        container.add(101);
        Assertions.assertEquals(100, container.get(1));
    }

    @Test
    public void addOneElementToArrayWithEmptySectionInMiddle(){
        Integer[] arr = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(arr);
        int index = container.add(777);
        Assertions.assertEquals(3, index);
    }

    @Test
    public void addNullElement(){
        Integer[] arr = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(arr);
        int index = container.add(null);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void addElementNullOnSecondPosition(){
        Integer[] arr = new Integer[]{1, null, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(arr);
        int index = container.add(777);
        Assertions.assertEquals(1, index);
    }

    @Test
    public void addElementToFullArray(){
        Integer[] arr = new Integer[]{1, 2, 3};
        DataContainer<Integer> container = new DataContainer<>(arr);
        int index = container.add(777);
        Assertions.assertEquals(3, index);
    }

    @Test
    public void addElementToFullArrayAndCheckElement(){
        Integer[] arr = new Integer[]{1, 2, 3};
        DataContainer<Integer> container = new DataContainer<>(arr);
        int index = container.add(777);
        Assertions.assertEquals(777, container.get(index));
    }

    @Test
    public void getElementWhenIndexNotExistInArray(){
        Integer[] arr = new Integer[]{999};
        DataContainer<Integer> container = new DataContainer<>(arr);
        Assertions.assertNull(container.get(1));
    }

    @Test
    public void getItems(){
        Integer[] arr = new Integer[]{999};
        DataContainer<Integer> container = new DataContainer<>(arr);
        Integer[] fromContainer = container.getItems();

        Assertions.assertEquals(arr, fromContainer);
//        Assertions.assertArrayEquals(arr, fromContainer);
    }

    @Test
    public void deleteTrue(){
        Integer[] arr = new Integer[]{999};
        DataContainer<Integer> container = new DataContainer<>(arr);
        Assertions.assertTrue(container.delete(0));
    }

    @Test
    public void deleteNotCorrectIndex(){
        Integer[] arr = new Integer[]{999};
        DataContainer<Integer> container = new DataContainer<>(arr);
        Assertions.assertFalse(container.delete(1));
    }


    @Test
    public void deleteCheckGet(){
        Integer[] arr = new Integer[]{999};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete(0);
        Assertions.assertNull(container.get(0));
    }

    @Test
    public void deleteCheckArray(){
        Integer[] arr = new Integer[]{999};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete(0);
        Integer[] fromContainer = container.getItems();

        Assertions.assertEquals(0, fromContainer.length);
    }

    @Test
    public void deleteFirstElement(){
        Integer[] arr = new Integer[]{99, 101, 103, 105, 107, 109};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete(0);
        Integer[] fromContainer = container.getItems();

        Assertions.assertEquals(101, fromContainer[0]);
        Assertions.assertEquals(103, fromContainer[1]);
        Assertions.assertEquals(105, fromContainer[2]);
        Assertions.assertEquals(107, fromContainer[3]);
        Assertions.assertEquals(109, fromContainer[4]);
    }

    @Test
    public void deleteSecondElement(){
        Integer[] arr = new Integer[]{99, 101, 103, 105, 107, 109};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete(1);
        Integer[] fromContainer = container.getItems();

        Assertions.assertEquals(99, fromContainer[0]);
        Assertions.assertEquals(103, fromContainer[1]);
        Assertions.assertEquals(105, fromContainer[2]);
        Assertions.assertEquals(107, fromContainer[3]);
        Assertions.assertEquals(109, fromContainer[4]);
    }

    @Test
    public void deleteLastElement(){
        Integer[] arr = new Integer[]{99, 101, 103, 105, 107,109};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete(5);
        Integer[] fromContainer = container.getItems();

        Assertions.assertEquals(99, fromContainer[0]);
        Assertions.assertEquals(101, fromContainer[1]);
        Assertions.assertEquals(103, fromContainer[2]);
        Assertions.assertEquals(105, fromContainer[3]);
        Assertions.assertEquals(107, fromContainer[4]);
    }

    @Test
    public void deleteByItem(){
        Integer[] arr = new Integer[]{99, 101, 103, 105, 107,109};
        DataContainer<Integer> container = new DataContainer<>(arr);

        Assertions.assertTrue(container.delete((Integer) 99));
    }

    @Test
    public void deleteByItemCorrectSize(){
        Integer[] arr = new Integer[]{99, 101, 103, 105, 107,109};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete((Integer) 99);
        Integer[] fromContainer = container.getItems();
        Assertions.assertEquals(5, fromContainer.length);
    }

    @Test
    public void deleteByItemCorrectData(){
        Integer[] arr = new Integer[]{99, 101, 103, 105, 107, 109};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.delete((Integer) 99);
        Integer[] fromContainer = container.getItems();

        Assertions.assertEquals(101, fromContainer[0]);
        Assertions.assertEquals(103, fromContainer[1]);
        Assertions.assertEquals(105, fromContainer[2]);
        Assertions.assertEquals(107, fromContainer[3]);
        Assertions.assertEquals(109, fromContainer[4]);
    }

    @Test
    public void deleteByItemCheckCorrectEquals(){
        String[] arr = new String[]{"hello", "ilya"};
        DataContainer<String> container = new DataContainer<>(arr);
        container.delete(new String("hello"));
        String[] fromContainer = container.getItems();

        Assertions.assertEquals("ilya", fromContainer[0]);;
    }

    @Test
    public void deleteDoubleEqualsElement(){
        String[] arr = new String[]{"hello", "hello"};
        DataContainer<String> container = new DataContainer<>(arr);
        container.delete(new String("hello"));
        String[] fromContainer = container.getItems();

        Assertions.assertEquals(1, fromContainer.length);
    }

    @Test
    public void deleteNull(){
        String[] arr = new String[]{"hello", "hello"};
        DataContainer<String> container = new DataContainer<>(arr);

        Assertions.assertFalse(container.delete(null));
    }

    @Test
    public void toStringEmpty(){
        String[] arr = new String[]{};
        DataContainer<String> container = new DataContainer<>(arr);

        Assertions.assertEquals("{}", container.toString());
    }

    @Test
    public void toStringWithOneElement(){
        String[] arr = new String[]{"hello"};
        DataContainer<String> container = new DataContainer<>(arr);

        Assertions.assertEquals("{hello}", container.toString());
    }

    @Test
    public void toStringWithTwoElement(){
        String[] arr = new String[]{"hello", "ilya"};
        DataContainer<String> container = new DataContainer<>(arr);

        Assertions.assertEquals("{hello, ilya}", container.toString());
    }

    @Test
    public void toStringWithNullElement(){
        String[] arr = new String[]{"hello", null, "ilya"};
        DataContainer<String> container = new DataContainer<>(arr);

        Assertions.assertEquals("{hello, ilya}", container.toString());
    }

    @Test
    public void toStringWithNullFromStartElement(){
        String[] arr = new String[]{null, "hello", "ilya"};
        DataContainer<String> container = new DataContainer<>(arr);

        Assertions.assertEquals("{hello, ilya}", container.toString());
    }

    @Test
    public void sort1(){
        String[] arr = new String[]{"i", "hello", "1", "Как домашка"};
        DataContainer<String> container = new DataContainer<>(arr);

        container.sort(new StringLengtnComparator());
        Assertions.assertEquals("i", container.get(0));
        Assertions.assertEquals("1", container.get(1));
        Assertions.assertEquals("hello", container.get(2));
        Assertions.assertEquals("Как домашка", container.get(3));
    }

    @Test
    public void sort2(){
        Integer[] arr = new Integer[]{3, 1, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.sort(Integer::compareTo);
        Assertions.assertEquals(1, container.get(0));
        Assertions.assertEquals(3, container.get(1));
        Assertions.assertEquals(3, container.get(2));
        Assertions.assertEquals(777, container.get(3));


    }
}
