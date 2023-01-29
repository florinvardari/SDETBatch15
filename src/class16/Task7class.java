package class16;

public class Task7class {
    //1) Create a method that will accept an array as parameters
    // and will return a sum of all elements from that array.
    // Method should be visibly only within same package and
    // accessible by the creating an instance of the class.
    int  arrayElements(int [] array) {
        int sum = 0;
        for (int num : array ) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
       int [] arr={10,20,35,45};
       Task7class task=new Task7class();
        System.out.println(task.arrayElements(arr));


    }
}
