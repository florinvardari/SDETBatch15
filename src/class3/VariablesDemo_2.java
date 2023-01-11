package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {

         /*
        to rename something -click refactor--> rename
         */
        int age=10;
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10;
        age=number;// i am saying to java replace value of age  with the value id number variable
        System.out.println(age);
        age=number+age;
        System.out.println(age);
        age=age+20; //



    }
}
