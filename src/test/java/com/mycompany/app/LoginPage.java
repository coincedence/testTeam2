package com.mycompany.app;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

class LoginPage
{
    private final SelenideElement loginField =$(By.xpath("//input[@id='field_email']"));
    private final SelenideElement passwordField =$(By.xpath("//input[@id='field_password']"));
    private final SelenideElement loginButton =$(By.xpath("//div[@class='login-form-actions']/input"));

    public void login(String email, String pwd) {
        loginField.setValue(email);
        passwordField.setValue(pwd);
        loginButton.click();
    }
}
