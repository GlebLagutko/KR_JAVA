package KR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyContainer1<T extends Tree> {
    private List<T> list;

    public MyContainer1() {
        list = new ArrayList<>();
    }

    public void add(T value) {
        this.list.add(value);
    }

    public T max() throws EmptyContainerException {
        if (this.list.size() == 0)
            throw new EmptyContainerException();
        return Collections.max(this.list);
    }

    public T min() throws EmptyContainerException {
        if (this.list.size() == 0)
            throw new EmptyContainerException();
        return Collections.min(this.list);
    }

    public void print() {
        for (T e : this.list) {
            e.print();
            System.out.println();
        }
        System.out.println();
    }

    public int count(T value){
        return  Collections.frequency(list,value);
    }

    public T search(T value) {
        List<T> temp = new ArrayList<>(this.list);
        temp.sort(null);
        int index = Collections.binarySearch(temp, value);
        return index != -1 ? value : null;
    }
}
