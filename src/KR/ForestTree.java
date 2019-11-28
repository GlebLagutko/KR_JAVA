package KR;

public class ForestTree extends Tree {
    private int count;
    public ForestTree(String name, TreeType treeType, int old, int count) {
        super(name, treeType, old);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + count;
    }

    @Override
    public boolean equals(Object o) {
        ForestTree temp = (ForestTree) o;
        return super.equals(o) && count == temp.count;
    }
}
