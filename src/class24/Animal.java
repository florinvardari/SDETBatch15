package class24;

public abstract class Animal {
    /*
    define the speak eat methods and create 3 subclasses and override the speak emthods
     */
    abstract void eat();
    abstract void speak();

}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Woof Woof");
    }

    @Override
    void eat() {
        System.out.println("Dog eating raw beef");
    }

}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }
    @Override
    void eat() {
        System.out.println("Cat eating fish");
    }
}
class Elephant extends Animal{
    @Override
    void eat() {
        System.out.println("Elephant eating trees");
    }

    @Override
    void speak() {
        System.out.println("boooooofff");
    }
}