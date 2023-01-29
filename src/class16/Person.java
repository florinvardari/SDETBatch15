package class16;

public class Person {
    private  double bankBalance=1250000;
    String Addres="Street 123";
   public String name ="Jon Snow";
  private void printPassword() {
       System.out.println("Pass123");
   }

       void printSSN(){
           System.out.println("123456789");
       }
     public  void printTikTokAccount(){
           System.out.println("user123");
   }

    public static void main(String[] args) {

        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Addres);
        System.out.println(person.name);
        person.printPassword();
        person.printSSN();
        person.printTikTokAccount();

    }
    }

