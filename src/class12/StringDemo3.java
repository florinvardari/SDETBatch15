package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Akhter";
        String lastname="Lava";
        String fullName=firstName+" "+lastname;// most widely used
        System.out.println(fullName);
        System.out.println(firstName+" "+lastname);
        System.out.println(firstName.concat(" "+lastname));
    }
}
