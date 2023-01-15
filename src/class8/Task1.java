package class8;

public class Task1 {
    public static void main(String[] args) {
      int temp=75;
        while (temp<=105) {
            if (temp <= 100) {
                System.out.println("I love summer " + temp);
            } else {
                System.out.println("Its very hot " + temp);

            }
            temp += 5;
        }
    }
}
