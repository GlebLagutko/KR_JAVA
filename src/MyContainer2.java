import java.util.ArrayList;
import java.util.Collections;

public class MyContainer2<T extends Comparable<T>> extends ArrayList<T> {
    public MyContainer2(){
        super();
    }


    public T max() throws MyException {
        if (this.size() == 0)
            throw new MyException("Is empty!!!");
        return Collections.max(this);
    }

    public T min() throws MyException {
        if (this.size() == 0)
            throw new MyException("Is empty!!!");
        return Collections.min(this);
    }
}
