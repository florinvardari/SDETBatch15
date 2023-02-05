package class18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            String noSpace=givenString.replaceAll(" ","");


        StringBuilder rvsStr=new StringBuilder(noSpace);
        rvsStr.reverse();
        String reversedSt=rvsStr.toString();
        System.out.println(noSpace);
        System.out.println(reversedSt);

        boolean flag;
        if (noSpace.equalsIgnoreCase(reversedSt)){
            flag=true;
        }else {
            flag=false;
        }
        System.out.println(flag);



    }

}

