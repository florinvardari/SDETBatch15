package class20;

public class JavaTeacher extends Teacher {
    void  code(){
        System.out.println("Java teacher teach us how to code");
    }

    public static void main(String[] args) {

        Teacher java=new Teacher();
        java.teacherName="Asel";
        java.teacherId="A67";

        java.homework();//public
        java.grade();//protected
        java.scholarship();//default
        //java.extraPoint(); // private members (variables and methods ) DO NOT participate in inheritance.



    }
}
