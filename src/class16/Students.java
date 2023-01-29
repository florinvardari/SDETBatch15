package class16;

public class Students {
    String name;
    String ID;
   static int numberOfStudents;



    public static void main(String[] args) {



        Students st1 = new Students();
        st1.name = "Florin";
        st1.ID = "S123456";
        st1.numberOfStudents++;

        Students st2 = new Students();
        st2.name = "Alper";
        st2.ID = "S125356";
        st2.numberOfStudents++;
        Students st3 = new Students();
        st3.name = "Vardari";
        st3.ID = "S1124356";
        st3.numberOfStudents++;

        System.out.println(st2.numberOfStudents);
    }

    }

