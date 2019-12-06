package KR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainKr {
    public static void main(String[] args) {
        MyContainer<ForestTree> listForest = fillForestContainer();
        MyContainer<FruitTree> listFruit = fillFruitContainer();
        listFruit.demo(new FruitTree("Apple", TreeType.CONIFEROUS, 230, 12), TreeType.CONIFEROUS);
        listForest.demo(new ForestTree("Oak", TreeType.DECIDUOUS, 34, 545), TreeType.CONIFEROUS);
    }

    private static MyContainer<ForestTree> fillForestContainer() {
        MyContainer<ForestTree> listForest = new MyContainer<>();
        try (Scanner sc = new Scanner(new File("src\\KR\\ForestTrees"))) {
            while (sc.hasNext()) {
                ForestTree tr = new ForestTree(sc.next(), TreeType.toType(sc.next()), sc.nextInt(), sc.nextInt());
                listForest.add(tr);
            }
        } catch (FileNotFoundException ex) {

        } catch (EnumIncorrectException ex) {
            System.out.println(ex.getMessage());
        }
        return listForest;
    }

    private static MyContainer<FruitTree> fillFruitContainer() {
        MyContainer<FruitTree> listFruit = new MyContainer<>();
        try (Scanner sc = new Scanner(new File("src\\KR\\FruiteTrees"))) {
            while (sc.hasNext()) {
                FruitTree tr = new FruitTree(sc.next(), TreeType.toType(sc.next()), sc.nextInt(), sc.nextInt());
                listFruit.add(tr);
            }
        } catch (FileNotFoundException ex) {

        } catch (EnumIncorrectException ex) {
            System.out.println(ex.getMessage());
        }
        return listFruit;
    }
}
