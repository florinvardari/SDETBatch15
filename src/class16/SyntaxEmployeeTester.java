package class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empID = "123456";
        emp1.salary = 2000;


        class16.SyntaxEmployee emp2 = new SyntaxEmployee();
        emp2.empID = "654321";
        emp2.salary = 3000;



        System.out.println(emp1.salary);
        System.out.println(emp1.empID);
        System.out.println(emp2.salary);
        System.out.println(emp2.empID);
        System.out.println(class16.SyntaxEmployee.CEO);

    }
}