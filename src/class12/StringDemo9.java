package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="dsgsdsdga 214324324 @#$%%@#% dfgdsafgsdgsd";
        int count=0;
        int count1=0;
        for (int i = 0; i <str.length() ; i++) {
        if (Character.isAlphabetic(str.charAt(i))){
            count++;
        } else if (Character.isDigit(str.charAt(i))) {
            count1++;
        }


        }
        System.out.println("We have "+count+" letters");
        System.out.println("we have "+ count1+" numbers");

        }
    }

