package Class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
        // Creating a actual object from the class scanner
        Scanner scan=new Scanner(System.in);
        //This is how we create the objects of a class
        Dog dog1=new Dog();
        dog1.bark();
        dog1.sleep();
        dog1.eat();
    }
}
