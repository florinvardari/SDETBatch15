package Practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class A {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        for (int i = 2; i < 10; i++) {
            int num = linkedList.get(i - 1) + linkedList.get(i - 2);
            linkedList.add(num);
        }

        for (int num : linkedList) {
            System.out.print(num + " ");
        }



    }
}


