package class16;

public class Task4 {
    String sayHello(String countryName){
        switch (countryName){
            case "USA":
                return "Hello";
            case "Kazakhstan":
            return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Invalid country";

        }
    }

    public static void main(String[] args) {
        Task4 task=new Task4();
        System.out.println(task.sayHello("China"));
    }
}
