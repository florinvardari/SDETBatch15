package class9;

public class ArrayDemo {
    public static void main(String[] args) {


        String name="Slava";
        String name2="Safi";
        String name3="Jason";
        String name4="Nabi";
        String name5="Anees";


        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        System.out.println(name2);

        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        //System.out.println([500]); error because there is no name on location on index number 500
        //System.out.println([-5]); error because the minimum is 0 index cant be negative
        for (int i = 0; i <=5 ; i++) {
            System.out.println(names[i]);

        }
    }
}
