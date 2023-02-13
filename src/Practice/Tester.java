package Practice;

public class Tester {
    private  static String maxLength(String[] str){
        String max=str[0];
        for (int i = 0; i < str.length ; i++) {
            if (str[i].length()>max.length()){
                max=str[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
