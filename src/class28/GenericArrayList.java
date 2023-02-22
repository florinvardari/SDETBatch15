package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {


    public static void main(String[] args) {
        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);


        // old version not used anymore
        ArrayList name=new ArrayList();
        name.add("Zafar");
        name.add(10);
        name.add('a');
        name.add(new Dog("Alf","brown","rottie"));

        for (Object j:name) {
            System.out.println(j);
        }
    }
}
