package class5;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
         1 2 3 4 5 6 7 8 9 10   15
         */
        int number=9;
        if (number==9){
            System.out.println("hello world");
        }else {
            System.out.println("hello java");
        }

        String country="China";
        if (!country.equals("BadCountry")){// if country does not equal to BadCountry
            System.out.println("you are welcome");
        }

    }

}
