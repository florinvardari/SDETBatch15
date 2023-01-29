package class15;

public class MethodPractice {
    boolean  check(int num1 ){
        boolean flag;
       if (num1%2==0){
           flag=true;
       }else {
           flag=false;
       }
       return  flag;
    }
    boolean  check1(int num1 ) {
        boolean flag;
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
      boolean check2(int num1){
            return num1%2==0;
        }
}
