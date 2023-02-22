package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "NIma";
        String[] names = {"Hiral", "NIma", "Laura", "Nat"};
        System.out.println(contains(name, names));
    }

    public static boolean contains(String nameToBeSearched,String[] names) {

        for (String s : names) {
            if (nameToBeSearched.equals(s)) {
                return true;
            }
        }
                return false;


    }

}
