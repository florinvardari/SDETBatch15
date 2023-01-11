package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        Scanner ==> name of the class
        scan ==> just a variable like we create primitive variables
        System.in ==> tells the computer we want to read data from keyboard
         */
        System.out.println("Please enter your age?");
        int age=scan.nextInt();
        System.out.println("You are "+age+" Years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is  "+weight+" Kgs");
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);//* .charAt(0) it will hold only the first letter"Male=M"
        System.out.println("your gender is "+gender);
        System.out.println("Please enter your name");
        String name=scan.next();// when we have to take only one word as input
        System.out.println("Your name is "+name);
        System.out.println("Please enter your full name");
        scan.nextLine();//trick to make nextLine method work after we have used any other method from Scanner class
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close();// Good practice makes scanner to keep less memory

    }

}
