package class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from parent class");
    }
}
class SubClass extends SuperClass{
    SubClass(){
     //   super();// makes a call to the parent class constructor
        System.out.println("i am a child constructor");
    }

}