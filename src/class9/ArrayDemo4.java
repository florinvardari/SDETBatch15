package class9;

public class ArrayDemo4 {
    public static void main(String[] args) {

     String [] letters={"A","B","c","d","e","F"};
     letters[0]="z";// updating variable at index 0
        for (int i = 0; i < letters.length ; i++) {
            System.out.println(letters[i]);
        }

    }
}
