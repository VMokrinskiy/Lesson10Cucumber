package lesson10.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lesson10.acceptancetests.Test;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


public class ExampleSteps {

    static Initialization initialization = new Initialization();

    @Given("I go to (.*)")
    public void goToUrl(String URL) {
        PageFactory.initElements(Test.getDriver(), initialization);
        Test.getDriver().navigate().to(URL);
    }

    @When("^I type login (.*) and password (.*)")
    public void inputUserName(String userName, String password) {
        if(!initialization.getUserName().isDisplayed())
            Test.getDriver().manage().window().maximize();
        initialization.getUserName().sendKeys(userName);
        initialization.getPassword().sendKeys(password);
    }

    @Then("I should go to home page")
    public void getToHomePage() throws InterruptedException {
        initialization.getLogin().click();
        Assert.assertEquals(Test.getDriver().getCurrentUrl(), "https://mail.yandex.ru/");
        Thread.sleep(2000);
    }

    @When("I type word (.*)")
    public void inputSearchWord(String word) {
        initialization.getSearchName().sendKeys(word);
    }

    @Then("I press \"Find\"")
    public void pressFind() {
        initialization.getButtonSearch().click();
        initialization.closeSession();
    }

}