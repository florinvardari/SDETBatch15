package class23;

import class19.School;

public class StudentTester {
    public static void main(String[] args) {

        Student [] school={new SyntaxStudents(),new CollegeStudent(),new SchoolStudent()};

        for (Student schools : school){
            schools.studentInfo();
            schools.teachers();
            schools.quizzing();
        }
    }
}
