package class21;

public class Programing {
    Programing(){
        System.out.println("I love programing languages");
    }
    Programing(String name){
        System.out.println("I love "+name);
    }

    public static void main(String[] args) {
        Programing language=new Programing();
        new Programing("Java");

    }
}
