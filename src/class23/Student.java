package class23;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */

    public void studentInfo(){
        System.out.println("Student  name and last name");
    }
    public void teachers(){
        System.out.println("The school has at leas 5 teacher's");
    }
    public void quizzing(){
        System.out.println("Teacher does quiz every week");
    }
}
class  SyntaxStudents extends Student{


    @Override
    public void teachers() {
        System.out.println("Syntax school has 7 teachers");
    }

    @Override
    public void quizzing() {
        System.out.println("Syntax doe not quiz students every week");
    }
}
class CollegeStudent extends Student{


    @Override
    public void teachers() {
        System.out.println("College has at least 20 professors");
    }

    @Override
    public void quizzing() {
        System.out.println("In a college you get quizzed at the end of semester");
    }
}
class SchoolStudent extends Student{

    @Override
    public void teachers() {
        System.out.println("School  has 6 teachers");
    }

    @Override
    public void quizzing() {
        System.out.println("School  quizzes students every 2 weeks");
    }
}
