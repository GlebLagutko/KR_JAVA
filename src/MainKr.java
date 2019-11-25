import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainKr {
    public static void main(String[] args) {
        MyContainer2<Student> myContainer2;
        MyContainer1<Student> myContainer1 = new MyContainer1<>();
        try(Scanner sc = new Scanner(new File("src/input"))){
         while (sc.hasNext()){
             myContainer1.add(new Student(sc.next(),sc.nextInt(),sc.nextDouble()));
         }
        }catch (FileNotFoundException ex){
        }
        try{
            System.out.println(myContainer1.max());
            System.out.println(myContainer1.min());
        }catch (MyException ex){

        }
    }
}
