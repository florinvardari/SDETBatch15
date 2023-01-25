package class13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter dads name");
        String dadsName=scan.next();
        System.out.println("Please enter moms name");
        String momsName=scan.next();
        System.out.println("boy or girl");
        String expectation= scan.next();
        String firstHalf;
        String secondHalf;
        if (expectation.equalsIgnoreCase("boy")){
             firstHalf=dadsName.substring(0,dadsName.length()/2);
             secondHalf=momsName.substring(momsName.length()/2);
            System.out.println(firstHalf+secondHalf);
        } else if (expectation.equalsIgnoreCase("girl")) {
             firstHalf=momsName.substring(0,momsName.length()/2);
             secondHalf=dadsName.substring(dadsName.length()/2);
            System.out.println(firstHalf+secondHalf);
        }


    }
}
