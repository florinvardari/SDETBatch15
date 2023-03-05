package Practice;


import class30.Entry;

import java.util.*;

public class Person {

     public static void display(Map<String,Integer> identify){
        if (!identify.isEmpty()){
            var entry=identify.entrySet();
            for (var x:entry)
            System.out.println(x.getKey()+" - "+x.getValue());
        }else {
            System.out.println("map is empty");
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        display(map);

        map.clear();

        display(map);


    }

}

