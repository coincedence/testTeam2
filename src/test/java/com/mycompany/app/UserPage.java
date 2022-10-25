package com.mycompany.app;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {
    /**
     * Clicking on music button
     */
    public void click(){
        $(By.xpath("//*[@id=\"music_toolbar_button\"]/div[2])")).click();
    }

    /**
     * Taking song name
     * @return the song name
     */
    public String takeSongName(){
        return $(By.xpath("//*[@class=\"feed-w\"]//*[@class=\"track-with-cover_line\"]" +
                "//*[@itemprop=\"name\"]")).text();
    }
}
