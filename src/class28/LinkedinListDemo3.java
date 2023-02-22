package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedinListDemo3 {
    public static void main(String[] args) {

        // linkedLis ==> 69ms
        // ArrayList ==> 62020ms
        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0,"Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
