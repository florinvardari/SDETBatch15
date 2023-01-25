package class13;

public class Task1 {
    public static void main(String[] args) {
        String str="Hello";
        int mid=0;
        if (!str.isEmpty()){
            if (str.length()%2!=1 && str.length()>3){
                mid=str.length()/2;
            }
        }
        System.out.println(str.charAt(3));
    }
}
