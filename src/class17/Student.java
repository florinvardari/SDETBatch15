package class17;

public class Student {
    /*
    Create class call it student define 4 instance field like
    Name, Age, Weight, ID create 5 objects of this class do this task
    without constructors and with constructors
     */
    String name;
    int age;
    double weight;
    int id;
public  Student(String studentName, int studentAge, int studentId){// for student 6
    name=studentName;
    age=studentAge;
    id=studentId;
}
   public Student(String studentName, int studentAge, double studentWeight, int studentId){
        name=studentName;
        age=studentAge;
        weight=studentWeight;
        id=studentId;
    }

    void printInfo1(){
        System.out.println("Student name "+name+" age "+age+" weight "+weight+" ID "+id);
    }
}
