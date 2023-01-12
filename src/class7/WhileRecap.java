package class7;

public class WhileRecap {
    public static void main(String[] args) {
        int number=10;
        while (number<20){
            System.out.println(number<20);
            if (number<15){
                System.out.println("Number is still less then 15");
            }
            else {
                System.out.println("Number is greater then 15");
            }
            System.out.println(number);
            number++;
        }

    }
}
