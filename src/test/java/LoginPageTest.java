import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ShouldBe;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    @Test
    public void SuccessfulLogin(){
        loginPageSteps.ClickOnFormAuth()
                .InputUsername()
                .InputPassword()
                .ClickOnLoginButton();
//        sleep(1000);
        SelenideElement loginMessage = $(".subheader").shouldBe(Condition.visible, Duration.ofMillis(1000));
        Assert.assertEquals(loginMessage.getText(), "Welcome to the Secure Area. When you are done click logout below.");
    }
}
