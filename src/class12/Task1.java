package class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter user name");
        String userName= scan.nextLine();
        System.out.println("Please enter password");
        String password= scan.nextLine();
        String confirm=scan.nextLine();
        if (userName.isEmpty() || password.isEmpty()){
            System.out.println("Please enter user name and password");
        } else if (password.length()<8) {
            System.out.println("Password is to short");
        } else if (password.contains(userName)) {
            System.out.println("Password can not contain user name");
        } else if (!password.equals(confirm)) {
            System.out.println("Password do not match ");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
}
