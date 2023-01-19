package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] number=new int[5];

        number[0]=scan.nextInt();
        number[1]= scan.nextInt();
        number[2]= scan.nextInt();
        number[3]= scan.nextInt();
        number[4]= scan.nextInt();


        for (int i = 0; i < number.length ; i++) {
            number[i]=scan.nextInt(i);
        }

        System.out.println(Arrays.toString(number));


    }
}
