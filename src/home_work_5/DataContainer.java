package home_work_5;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;
    // private List<T> arrColl = new ArrayList<T>();


    //конструктор
    public DataContainer(T[] data) {
        this.data = data;

    }

    public int add(T item) {
        if (item == null) {
            return -1;
        } else {
            for (int i = 1; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }
            data = Arrays.copyOf(data, data.length + 1);
            if (data.length - 1 == 0) {
                data[0] = item;
                //  get(0);
                return 0;
            } else {
                for (int i = 1; i < data.length; i++) {
                    if (data[i] == null) {
                        data[i] = item;
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    T get(int index) {
        if (index > 0 && index < data.length) {
            return data[index];
        }
        return null;

    }

    T[] getItems() {
        return data;
    }

    boolean delete(int index) {
        if (index > data.length || index < 0) {
            return false;
        }
        T elementToBeDeleted = get(index);
        if (elementToBeDeleted != null) {
            T[] newData = Arrays.copyOf(this.data, this.data.length - 1);
            for(int i =0, y=0; i< data.length; i++){
                if (this.data[i] != elementToBeDeleted){
                    newData[y] = this.data[i];
                    y++;
                }

            }
            data = newData;
        }
        return true;
    }

    boolean delete (T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0, y = 0; i < data.length; i++) {
            if(item.equals(data[i])){
                int element = i;
                delete(element);
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator){
        for (int i = 0; i < data.length; i++) {
            for (int n = (data.length - 1); n > i; n--) {
                if(comparator.compare(data[i], data[n]) > 0) {
                    T t = data [i];
                    data[i]=data[n];
                    data[n]=t;
                }
            }
        }
    }

@Override
    public String toString() {
        if (data == null)
            return null;

        int emp = data.length - 1;
        if (emp == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0, y = 0; i < data.length; i++) {
            if (data[i] == null) {
                continue;
            } else {
                b.append(String.valueOf(data[i]));
            }
            if (i == emp)
                return b.append(']').toString();
            b.append(", ");
        }
        return null;
    }
}
