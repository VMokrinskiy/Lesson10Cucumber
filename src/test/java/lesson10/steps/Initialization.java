package lesson10.steps;

import lesson10.acceptancetests.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Initialization {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class,'auth__button')]")
    private WebElement login;

    @FindBy(xpath = "//input[@aria-label='Запрос']")
    private WebElement searchName;

    @FindBy(xpath = "//button[@class='button suggest2-form__button button_theme_websearch button_size_ws-head i-bem button_js_inited']")
    private WebElement buttonSearch;

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getButtonSearch() {
        return buttonSearch;
    }

    public WebElement getSearchName() {
        return searchName;
    }

    public WebElement getLogin(){
        return login;
    }

    public void closeSession() {
        Test.getDriver().close();
    }

}
