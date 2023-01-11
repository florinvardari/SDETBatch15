package class4;

public class IfElseConditionDemo5 {
    public static void main(String[] args) {
        int number=10;
        int number2=10;
        /*
        if number1 is equal to number2 in the console==> number are equal
        if number1>number2 ==> number1 is greater than number 2
        if number2>number1==> number is greater than number1
         */
        if(number==number2){
            System.out.println("Number are equal");
        }else if(number>number2){
            System.out.println("Number1 is greater than number2");
        } else if(number2>number)  {
            System.out.println("Number2 is greater than number1");

        }
    }
}
