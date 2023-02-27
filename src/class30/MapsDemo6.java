package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami F");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");



        Collection<String> values=studentsMap.values();
        Collection<Integer> keys=studentsMap.keySet();
        System.out.println(values);

        //remove all values which contains letter "i"
        keys.removeIf(x->x>2);
        values.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);





    }
}
