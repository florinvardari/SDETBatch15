package class16;

public class TemaryOperator {
    public static void main(String[] args) {
        int number=0;
        /*
        if (3>2){
            number=10;
        }else {
            number=20;
        }

        System.out.println(number);
*/
        number=(3>2)?10:20;  //shortcut for if else condition
        number=(3>2)?(4>5)?10:65:20; /// shortcut for nestedif condition
        System.out.println(number);



    }
}
