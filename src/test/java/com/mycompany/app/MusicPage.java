package com.mycompany.app;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selenide.actions;

public class MusicPage {

    private final SelenideElement findField = $(By.xpath("//wm-search-input/input"));
    private final SelenideElement options = $(By.xpath("//wm-track-actions"));
    private final SelenideElement shareButton = $(By.xpath("//wm-tico[@icon='ico_reshare_16']"));
    private final SelenideElement addTextButton = $(By.xpath("//wm-tico[@icon='ico_compose_16']"));
    private final SelenideElement finalShareButton = $(By.xpath("//div[@title='Поделиться']"));
    private final SelenideElement firstTrack = $(By.xpath("//wm-tracks-list//wm-track[1]"));
    public void find(String query){
        findField.click();
        findField.setValue(query);
        findField.pressEnter();
    }

    public SelenideElement getFirstTrack(){
        return firstTrack;
    }

    public void addTrack(SelenideElement track) {
        track.hover();
        options.click();
        shareButton.click();
        addTextButton.click();
        finalShareButton.click();
    }
}
