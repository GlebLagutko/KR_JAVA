package KR;

public abstract class Tree implements Comparable<Tree> {
    private String name;
    private TreeType treeType;
    private int years;


    public Tree(String name, TreeType treeType, int old) {
        this.name = name;
        this.treeType = treeType;
        this.years = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    abstract void print();

    @Override
    public String toString() {
        return "Name : "+ name + " Type: " + treeType + " Years:" + years;
    }

    @Override
    public int compareTo(Tree o) {
        if (!name.equals(o.name))
            return name.compareTo(o.name);
        if (years - o.years != 0)
            return -(years - o.years);
        return
                treeType.compareTo(o.treeType);
    }

    @Override
    public boolean equals(Object o) {
        Tree temp = (Tree) o;
        return this.name.equals(temp.name) && this.years == temp.years && this.treeType.equals(temp.treeType);
    }

}
