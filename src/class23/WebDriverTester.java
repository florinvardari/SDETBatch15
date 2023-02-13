package class23;

public class WebDriverTester {
    public static void main(String[] args) {


       /*
        WebDriver webDriver=new Safari();

        webDriver.startBrowser();;
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();
*/

        // an Array of type parent class can hold a objects of all the child class
        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()};

        for (WebDriver browser: browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }



    }

}
