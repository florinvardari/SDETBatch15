package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
       // a 2D array which can hold 3 one D arrays
                // each of of size 3
        String [][] train1=new String[3][3];
        String []cabin0={"Adam","Zafar","Sam"};
        String []cabin1={"Nabi","Saud","Anees"};
        String []cabin2={"Safi","Abeera","Zahra"};


        train1[0]=cabin0;
        train1[1]=cabin1;
        train1[2]=cabin2;

        // in the first[] we specife the addres of 1 D ARRAY
        System.out.println(train1[1][2]);
        System.out.println(Arrays.toString(train1[0]));

    }
}
