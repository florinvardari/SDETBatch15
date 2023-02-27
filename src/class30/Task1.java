package class30;

import java.util.LinkedHashSet;

public class Task1 {
    /*
        Create a Set collection in which you need to add names of the countries.
         In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annandale");

        cities.removeIf(x->x.startsWith("A")||x.startsWith("a"));
        System.out.println(cities);

    }
}
