package class20;
public class Child1 extends Parent {
    public static void main(String[] args) {



        Child1 c1=new Child1();
        c1.hello();
        Parent.bye();
        Child1.bye();
       // c1.money();// has private access

        c1.name="Gulzhanar";
        Child1.lastName="Berik";


    }
}
