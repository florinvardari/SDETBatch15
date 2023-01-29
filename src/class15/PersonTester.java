package class15;

import class16.Person;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        // System.out.println(person.bankBalance);-->priavte access
       // System.out.println(person.Addres);--> default access
        System.out.println(person.name);
        person.printTikTokAccount();
        Scanner scan=new Scanner(System.in);
        scan.next();

    }

}
