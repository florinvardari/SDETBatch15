package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scan=new Scanner(System.in);
        while (scan.next().equalsIgnoreCase("Sha")){
            System.out.println("Great Student who always wanted an example with String in loop");
        }

    }
}
