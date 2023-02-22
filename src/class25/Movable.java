package class25;

public interface Movable {
void move();
}
interface  Ownable{
    void own();
}
class Dog implements  Movable, Ownable{
    @Override
    public void own() {
        System.out.println("You can own me");
    }

    @Override
    public void move() {
        System.out.println("I can move");
    }
}
class Car implements Movable,Ownable{
    @Override
    public void move() {
        System.out.println("i can move");
    }

    @Override
    public void own() {
        System.out.println("You can Own me");
    }
}
