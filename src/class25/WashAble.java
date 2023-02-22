package class25;
public interface  WashAble{
    void wash();
}
class SmartWatch implements WashAble {

    @Override
    public void wash() {
        System.out.println("You can wash this smart watch with out any issues");
    }
}
class Phone implements WashAble{

@Override
  public   void wash(){
        System.out.println("i am IP65 Rated tou can wash me");
    }

}
class Inverter implements WashAble{
    public void wash(){
        System.out.println("i am IP65 Rated tou can wash me");
    }
}

