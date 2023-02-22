package class28;

import java.util.LinkedList;

public class LinkedinListDemo {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Artem");
        names.add("Elvira");
        names.add("Tammana");
        names.add("Temoz");
        names.add("Sam");
        System.out.println(names);

        for (Object s:names) {
            System.out.println(s);
        }

    }
}
