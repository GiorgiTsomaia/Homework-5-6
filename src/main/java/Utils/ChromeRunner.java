package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod
    public void setup(){
        open("http://the-internet.herokuapp.com/?fbclid=IwAR3wAFjKJUSh0kcjbeEs43ZA-4ueHPiHxaPGrpsl-Y6otFsQLIhdieujEMo");
        Configuration.browserSize = "1920x1080";
    }

    @AfterMethod
    public void teardown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
