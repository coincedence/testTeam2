package com.mycompany.app;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();
    MusicPage musicPage = new MusicPage();
    @Test
    public void shouldAnswerWithTrue()
    {
        open("https://ok.ru");
        loginPage.login("technoPol3", "technoPolis2022");
        userPage.click();
        musicPage.find("toxic britney spears");
        musicPage.addTrack(musicPage.getFirstTrack());

        // assertEquals("", userPage.takeSongName());
    }
}
