package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        byte b=10;
        int number2=b;

        float eggs=12.5f;
        int wholepart=(int)eggs;// type casting we are converting from float to an int
        System.out.println(wholepart);



    }
}
