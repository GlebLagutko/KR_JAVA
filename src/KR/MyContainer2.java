package KR;

import java.util.ArrayList;
import java.util.Collections;

public class MyContainer2<T extends Comparable<T>> extends ArrayList<T> {
    public MyContainer2() {
        super();
    }


    public T max() throws EmptyContainerException {
        if (this.size() == 0)
            throw new EmptyContainerException();
        return Collections.max(this);
    }

    public T min() throws EmptyContainerException {
        if (this.size() == 0)
            throw new EmptyContainerException();
        return Collections.min(this);
    }

    public int search(T value) {
        MyContainer2<T> temp = (MyContainer2) this.clone();
        temp.sort(null);
        int index = Collections.binarySearch(temp, value);
        return index != -1 ? this.indexOf(temp.get(index)) : -1;
    }
}
