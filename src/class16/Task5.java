package class16;

public class Task5 {
    boolean prime(int numbers) {
        boolean flag = true;
        if (numbers > 1) {
            for (int i = 2; i < numbers; i++) {
                if (numbers % 1 == 0) {
                    flag = false;
                }
            }
            } else {
                   flag = false;
                }
        return flag;
    }

    public static void main(String[] args) {
        Task5 task=new Task5();
        System.out.println(task.prime(3));

    }
}

