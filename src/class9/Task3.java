package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the start and end point");
        int start=scan.nextInt();
        int end=scan.nextInt();

        System.out.println("start "+start+" end "+end);

        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <=end ; i++) {
            if (i % 2 == 0) {
                evenSum+=i;
            } else {
                oddSum+=i;
            }
        }
        System.out.println("Sum of all the Even numbers "+evenSum);
        System.out.println("Sum of all the Odd numbers "+oddSum);
    }
}
