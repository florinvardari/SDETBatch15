package Practice;


import java.util.ArrayList;
import java.util.Iterator;

class Person {
     public static void main(String[] args) {
         ArrayList<Boolean> listA = new ArrayList<>();
         listA.add(true);
         listA.add(false);
         listA.add(false);

         ArrayList<Boolean> listB = new ArrayList<>(listA);

         // Print all values from listB using an iterator
         for (Boolean aBoolean : listB) {
             System.out.println(aBoolean);
         }
     }
}