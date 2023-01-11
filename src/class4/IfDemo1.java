package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money = 15000;
        if (money > 1000) {
            System.out.println("Lets buy an Iphone;");

        }

        if(money>2000){
            System.out.println("Lets buy Macbook");

        }
        boolean mothersDay =true;

        if (mothersDay) {
            System.out.println("happy mothers day");

        }
//equals method is only for non primitives
        String name = "Serdar";
        if (name.equals("Serdar")) {
            System.out.println("i love football");

        }

    }
}
