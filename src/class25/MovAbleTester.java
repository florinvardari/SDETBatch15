package class25;

public class MovAbleTester {
    public static void main(String[] args) {

        WashAble [] washAbles={new SmartWatch(),new Inverter()};

        for(WashAble w:washAbles){
            w.wash();
        }





    }
}
