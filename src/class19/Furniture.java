package class19;

public class Furniture {
    String type;
    double price;
    String color;
    // with a help of constructor we can initialize object with specific value
    Furniture(String type, double price , String color){
        this.type=type;
        this.color=color;
        this.price=price;
    }

    void print (){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
