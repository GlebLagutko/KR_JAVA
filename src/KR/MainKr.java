package KR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainKr {
    public static void main(String[] args) {
        MyContainer1<ForestTree> listForest = new MyContainer1<>();
        MyContainer1<FruitTree> listFruite = new MyContainer1<>();
        try (Scanner sc = new Scanner(new File("src\\FruiteTrees"))) {
            while (sc.hasNext()) {
                FruitTree tr = new FruitTree(sc.next(), TreeType.toType(sc.next()), sc.nextInt(), sc.nextInt(), sc.nextInt());
                listFruite.add(tr);
            }
        } catch (FileNotFoundException ex) {

        } catch (EnumIncorrectException ex){
            System.out.println(ex.getMessage());
        }

        listFruite.print();
        System.out.println(listFruite.count(new FruitTree("name1",TreeType.CONIFEROUS,23,34,2)));
        if( listFruite.search(new FruitTree("name1",TreeType.CONIFEROUS,23,34,2))!= null){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        try{
            System.out.println(listFruite.min());
        }catch (EmptyContainerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
