package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClassTask2 {
    public static void main(String[] args) {
        /**
         * Create a Set collection in which you need to add names of the countries.
         * In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> countries=new TreeSet<>();
        countries.add("England");
        countries.add("Italy");
        countries.add("France");
        countries.add("USA");

        System.out.println(countries);
        for (String sort:countries) {
            System.out.print(sort+" ");
        }
    }
}
