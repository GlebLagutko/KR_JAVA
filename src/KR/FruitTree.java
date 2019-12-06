package KR;

public class FruitTree extends Tree {

    private int harvestWeight;

    public int getHarvestWeight() {
        return harvestWeight;
    }

    public void setHarvestWeight(int harvestWeight) {
        this.harvestWeight = harvestWeight;
    }


    public FruitTree(String name, TreeType treeType, int count, int weight) {
        super(name, count, treeType);
        this.harvestWeight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " HarvestWeight: " + harvestWeight;
    }

    @Override
    void print() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        FruitTree temp = (FruitTree) o;
        return super.equals(o) && harvestWeight == temp.harvestWeight;
    }
}
