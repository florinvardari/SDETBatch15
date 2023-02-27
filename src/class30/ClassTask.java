package class30;

import java.util.*;
import java.util.Map;
public class ClassTask {
    /*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {

        Map<String,String> countires=new TreeMap<>();
        countires.put("Washington DC","USA");
        countires.put("Paris","France");
        countires.put("Rome","Italy");
        countires.put("London","England");
        countires.put("Madrid","Spain");


        var entrySet=countires.entrySet();

        for (var x:entrySet) {
            System.out.println(x.getKey()+" = "+x.getValue());
        }


        for (Map.Entry<String, String> entry : countires.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
