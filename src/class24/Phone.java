package class24;

public abstract class Phone {
    /*
    create a phone class lets create abstract methods like displayPictures, unlockPhone, sendText
    2 child classes Iphone Samsung Google and provide specific implementation
    lets write a code to achieve runtime polymorphism
     */
   abstract void displayPictures();
   abstract void unlockPhone();
   abstract void sendText();

}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Opening the picture from gallery on Iphone");
    }

    @Override
    void unlockPhone() {
        System.out.println("Swipe the screen to unlock the Iphone");
    }

    @Override
    void sendText() {
        System.out.println("Sending text from Iphone");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Displaying pictures from samsung");
    }

    @Override
    void unlockPhone() {
        System.out.println("Unlocking the samsung ");
    }

    @Override
    void sendText() {
        System.out.println("Sending text from samsung");
    }
}