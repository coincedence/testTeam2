package com.mycompany.app;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selenide.actions;

public class MusicPage {

    private final SelenideElement findField = $(By.xpath("//wm-search-input/input"));

    public void find(String query){
        findField.click();
        findField.setValue(query);
        findField.pressEnter();
    }

    public SelenideElement getFirstTrack(){
        SelenideElement firstTrack = $(By.xpath("//wm-tracks-list/wm-track"));
        return firstTrack;
    }

    public void addTrack(SelenideElement track) {
        actions().moveToElement(track);
        SelenideElement options = $(By.name("controls"));
        options.click();
        SelenideElement actionsMenu = $(By.xpath("wm-track-actions-menu"));
        SelenideElement shareButton = $(By.xpath("//wm-tico[@icon='ico_reshare_16']"));
        shareButton.click();
        SelenideElement addTextButton = $(By.xpath("//wm-tico[@icon='ico_compose_16']"));
        addTextButton.click();
        SelenideElement finalShareButton = $(By.xpath("//div[@title='Поделиться']"));
        finalShareButton.click();
    }
}
