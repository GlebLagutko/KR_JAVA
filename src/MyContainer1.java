import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyContainer1<T extends Comparable<T>> {
    private List<T> list ;

    public MyContainer1(){
        list = new ArrayList<>();
    }

    public void add(T value) {
        this.list.add(value);
    }

    public T max() throws MyException {
        if (this.list.size() == 0)
            throw new MyException("Is empty!!!");
        return Collections.max(this.list);
    }

    public T min() throws MyException {
        if (this.list.size() == 0)
            throw new MyException("Is empty!!!");
        return Collections.min(this.list);
    }
}
