package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import runner.BaseTest;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id='menu-item-1263']/a")
    private WebElement menWareButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MenWarePage getMenWarePage() {
        getWait2().until(ExpectedConditions.elementToBeClickable(menWareButton)).click();
        return new MenWarePage(getDriver());
    }
}
