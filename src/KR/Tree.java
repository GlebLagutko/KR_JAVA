package KR;

public abstract class Tree implements Comparable<Tree> {
    private String name;
    private int count;
    private TreeType treeType;


    public Tree(String name, int count, TreeType treeType) {
        this.name = name;
        this.count = count;
        this.treeType = treeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    abstract void print();

    @Override
    public String toString() {
        return "Name : " + name + " Type: " + treeType + " Count: " + count;
    }

    @Override
    public int compareTo(Tree o) {
        return count - o.count == 0 ? -name.compareTo(o.name) : count - o.count;
    }

    @Override
    public boolean equals(Object o) {
        Tree temp = (Tree) o;
        return name.equals(temp.name) && treeType.equals(temp.treeType);
    }

}
