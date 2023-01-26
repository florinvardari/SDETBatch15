package class14;

import java.util.Scanner;

public class MethodsDemo2 {
    // defining a method
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    void printHelloManyTimes(int times){
        for (int i = 0; i <times ; i++) {
            System.out.println("Hello World");
        }
    }
    void printManyTimes(int num, String word){
        for (int i = 0; i <num ; i++) {
            System.out.println(word);
        }

    }

}
