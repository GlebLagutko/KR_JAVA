package KR;

public class FruitTree extends Tree {

    private int weight;
    private int average;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public FruitTree(String name, TreeType treeType, int old, int weight, int average) {
        super(name, treeType, old);
        this.weight = weight;
        this.average = average;
    }

    @Override
    public String toString() {
        return super.toString() + " Weight: " + weight + " Average: " + average;
    }

    @Override
    void print() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        FruitTree temp = (FruitTree) o;
        return super.equals(o) && average == temp.average && weight == temp.weight;
    }
}
