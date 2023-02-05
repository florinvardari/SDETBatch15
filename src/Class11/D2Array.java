package Class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}
        };
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));// same as down there
        for (int i = 0; i <matrix[0].length ; i++) {// same as up there
            System.out.println(matrix[0][i]);
        }
        int[] arr=matrix[0];// this is another way
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

            }
        System.out.println("*************");
        System.out.println(Arrays.toString(matrix[2]));
        for (int j = 0; j <matrix[2].length ; j++) {
            System.out.println(matrix[2][j]);
        }
        }

}
