package class9;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int sum=0;
        int [] numbers={10,20,30,45,50};
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length ; i++) {
            sum=sum+numbers[i];// adding all the numbers
        }


        System.out.println(sum);

    }
}
