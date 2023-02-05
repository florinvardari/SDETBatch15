package class19;

public class BankTest {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=64846445;
        ba.money=1000;
        ba.deposit();

        System.out.println("---- Creating an Object-------");

        Checking check=new Checking();
        // features from parent
        check.accountNumber=4866;
        check.money=700;
        // features from class itself
        check.interest=0;

        check.deposit();
        check.transfer();

        System.out.println("---- Creating an Object-------");

        Savings savings=new Savings();
        savings.accountNumber=2514846;
        savings.money=486;
        savings.profit=100;
        savings.deposit();
        savings.takeProfit();

    }
}
