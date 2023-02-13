package class21;

public class Rectangle {

    void calculateArea(int length, int width){
        double area=0;
        area=width*length;
        System.out.println("the area of rectangle is "+area);
    }
    void calculateArea(double side){
       double area=0;
        area=side*side;
        System.out.println("the area of square is "+area);
    }
}
