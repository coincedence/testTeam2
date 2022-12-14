package com.mycompany.app;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {
    private final SelenideElement MusicButton = $(By.xpath("//*[@id=\"music_toolbar_button\"]/div[2]"));
    private final SelenideElement SongName = $(By.xpath("//*[@class=\"feed-w\"]" +
            "//*[@class=\"track-with-cover_line\"]//*[@itemprop=\"name\"]"));
    /**
     * Clicking on music button
     */
    public void click(){
        //*[@id="music_toolbar_button"]/div[2]
        MusicButton.click();
    }

    /**
     * Taking song name
     * @return the song name
     */
    public String takeSongName(){
        return SongName.text();
    }
}
