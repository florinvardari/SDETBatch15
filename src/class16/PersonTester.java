package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankBalance);-->private access
        System.out.println(person.Addres);
        System.out.println(person.name);
       // person.printPassword();--> private access
        person.printSSN();
        person.printTikTokAccount();
    }
}
