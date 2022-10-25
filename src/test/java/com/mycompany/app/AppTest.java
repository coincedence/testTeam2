package com.mycompany.app;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    LoginPage loginPage = new LoginPage();
    @Test
    public void shouldAnswerWithTrue()
    {
        open("https://ok.ru");
        loginPage.login("technoPol3", "Technopolis2022");
    }
}
