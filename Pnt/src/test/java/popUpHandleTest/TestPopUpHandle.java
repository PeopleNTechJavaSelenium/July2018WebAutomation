package popUpHandleTest;

import base.CommonAPI;
import logInPage.popUpHandlingPage.HandlePopUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPopUpHandle extends CommonAPI {
    @Test
    public void popUpHandle()throws InterruptedException{
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}
