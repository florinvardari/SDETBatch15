package class14;

public class MathTester {
    public static void main(String[] args) {
        Math mt=new Math();

        mt.calculate(10,10);

        mt.mul(5,3,6);

        int result=mt.sub(100,50);
        System.out.println(result);
    }
}
