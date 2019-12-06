package KR;

public class ForestTree extends Tree {
    private int countWood;

    public ForestTree(String name, TreeType treeType, int count, int countWood) {
        super(name, count, treeType);
        this.countWood = countWood;
    }

    public int getCountWood() {
        return countWood;
    }

    public void setCountWood(int countWood) {
        this.countWood = countWood;
    }

    @Override
    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " Wood count :" + countWood;
    }

    @Override
    public boolean equals(Object o) {
        ForestTree temp = (ForestTree) o;
        return super.equals(o) && countWood == temp.countWood;
    }
}
