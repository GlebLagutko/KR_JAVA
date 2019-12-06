package KR;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyContainer<T extends Tree> {
    private List<T> list = new ArrayList<>();

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

    public int count(T value) {
        return Collections.frequency(list, value);
    }

    public T search(T value) {
        List<T> temp = new ArrayList<>(this.list);
        temp.sort(null);
        int index = Collections.binarySearch(temp, value);
        return index < 0 ? value : null;
    }

    public int countListOrHvoi(TreeType type) {
        return this.list.stream().filter(p -> p.getTreeType() == type).mapToInt(Tree::getCount).sum();

    }

    public void showInfo() {
        List<Tree> temp = new ArrayList<>(this.list);
        temp.sort(Comparator.comparing(Tree::getCount));
        for (int i = temp.size(); i > 0; i--) {
            System.out.println(temp.get(i - 1));
        }
    }

    public Tree[] getTwoMin() {
        List<Tree> temp = new ArrayList<>(this.list);
        Collections.sort(list);
        return new Tree[]{temp.get(0), temp.get(1)};
    }

    public void demo(T tr, TreeType trtp) {
        System.out.println("--------------------------");
        System.out.println("First task:");
        this.showInfo();
        System.out.println("--------------------------");
        System.out.println("Second task:");
        System.out.println(this.count(tr));
        System.out.println("--------------------------");
        System.out.println("Third task:");
        try {
            System.out.println(this.min());
        } catch (EmptyContainerException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("--------------------------");
        System.out.println("Fourth task:");
        System.out.println(this.countListOrHvoi(trtp));

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (T e : this.list) {
            str.append(e.toString() + "/n");
        }
        return str.toString();
    }
}
