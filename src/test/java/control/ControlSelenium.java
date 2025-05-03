package control;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

public class ControlSelenium {

    protected By locator;
    protected WebElement control;
    //
    protected String controlName;


    public ControlSelenium(By locator, String controlName){

        this.locator = locator;
        //ALLURE
        this.controlName = controlName;
    }

    public void findControl(){
        control = Session.getSession().getBrowser().findElement(locator);
    }

    //ALLURE
    @Step("{0}")
    public void allureStep(String action){

    }

    public void click(){
        findControl();
        control.click();
        //ALLURE
        this.allureStep("Click on " + controlName);
    }

    public boolean isControlDisplayed(){
        boolean isDisplayed = Session.getSession().getBrowser().findElements(locator).size() > 0;
        //ALLURE
        this.allureStep("Is this control: " + controlName+" displayed? [" + isDisplayed + "]");
        return isDisplayed;
    }

    public void verifyTest(String texto){
        findControl();
        control.getText();
        this.allureStep("Get text on " + controlName);
    }


}
