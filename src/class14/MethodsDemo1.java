package class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {
        int [] arr={10,20,30,45,50};


        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
       // System.out.println(Arrays.toString(arr));
        int [] arr2={10,10,10,20,30};
        int sum2=0;
        for (int j : arr2) {
            sum2 = sum2 + j;
        }
        System.out.println(sum2);

        int [] arr3={10,10,15,20,30};
        int sum3=0;
        for (int j : arr3) {
            sum3 = sum3 + j;
        }
        System.out.println(sum3);

    }
}
