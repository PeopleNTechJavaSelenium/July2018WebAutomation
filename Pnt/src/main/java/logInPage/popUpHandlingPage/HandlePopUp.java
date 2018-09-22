package logInPage.popUpHandlingPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HandlePopUp {

    @FindBy(css = ".modal-body")
    public WebElement scholarshipPopUpWindowWebElement;
    @FindBy(css = ".modal-header.border-0 .close")
    public WebElement scholarshipPopUpWindowCloseWebElement;

    public WebElement getScholarshipPopUpWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return scholarshipPopUpWindowWebElement;
    }

    public void setScholarshipPopUpWindowWebElement(WebElement scholarshipPopUpWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.scholarshipPopUpWindowWebElement = scholarshipPopUpWindowWebElement;
    }

    public WebElement getScholarshipPopUpWindowCloseWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return scholarshipPopUpWindowCloseWebElement;
    }

    public void setScholarshipPopUpWindowCloseWebElement(WebElement scholarshipPopUpWindowCloseWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.scholarshipPopUpWindowCloseWebElement = scholarshipPopUpWindowCloseWebElement;
    }

    public boolean isScholarshipPopUpWindowDisplayed(WebDriver driver1, String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean value = CommonAPI.isPopUpWindowDisplayed(driver1, locator);
        return value;
    }
    public void closePopUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setScholarshipPopUpWindowCloseWebElement(scholarshipPopUpWindowCloseWebElement);
        getScholarshipPopUpWindowCloseWebElement().click();
    }

    public void handlePopUpWindowBeforeLogIn(WebDriver driver1)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.sleepFor(2);
        if(isScholarshipPopUpWindowDisplayed(driver1, ".modal-body")) {
            TestLogger.log("Yes, displayed. Handle it now.");
            closePopUpWindow();
            TestLogger.log("Sleep for 2 sec");
            CommonAPI.sleepFor(2);
        }
    }

}