package class15;

public class Task {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:
     createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String email(String name,String lastname ,String email){
        return name+lastname+"@"+email+"com";
    }

    public static void main(String[] args) {
        Task pr=new Task();
        System.out.println(pr.email("florin","vardari","gmail"));
    }
}
