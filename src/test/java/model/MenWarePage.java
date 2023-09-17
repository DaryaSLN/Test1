package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenWarePage extends BasePage {
    @FindBy(xpath = "//h1")
    private WebElement pageHeader;

    public MenWarePage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return pageHeader.getText();
    }
}
