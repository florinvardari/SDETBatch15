package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number; // it has to be declared outside of the do
        do {
            System.out.println("Please enter a number");
            number=scan.nextInt();
        }while (number!=5);
    }
}
