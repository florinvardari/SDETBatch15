package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Please enter 3 numbers.");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c || b > a && b > c || c > a && c > b) {
            System.out.println(a + " Is largest number");
        } else {
            System.out.println(b + " Is the largest number");
            {

            }
        }

    }
}