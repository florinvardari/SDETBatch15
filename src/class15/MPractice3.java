package class15;

public class MPractice3 {
    /*
    create a method tha takes an array of intigers sum all the element from the array
    and return the sum.
     */
    int arraySum(int[] arr){
        int sum=0;
        for (int num: arr ){
            sum+=num;
        }
        return sum;
    }


}
