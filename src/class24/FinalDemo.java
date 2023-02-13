package class24;

public final class FinalDemo {
    public static void main(String[] args) {
        final  int num;// we have created a constant variable
        num=20;
        //num=30; not possible because the variable is declared final
    }
   final void  noOneShouldOverrideIt(){
        System.out.println("this method should never be overridden otherwise it might break the code base");
    }
}
/*
class Nelson extends FinalDemo{---> if th parent class is final we cant inherit
   /* void  noOneShouldOverrideIt(){ cant override this method as it is declared as final
        System.out.println("Let me do that");
    }
*/

