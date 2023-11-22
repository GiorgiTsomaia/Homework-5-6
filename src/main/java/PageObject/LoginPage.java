package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            _formAuth = $(byText("Form Authentication")),
            _usernameField = $("#username"),
            _passwordField = $("#password"),
            _loginButton = $(byText("Login"));
}
