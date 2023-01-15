package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Do you want a credit card?");
            String UserResponse=scan.next();
            if (UserResponse.equalsIgnoreCase("yes")){
                break;
            }
        }
    }
}
