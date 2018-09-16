package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI{

    @Test
    public void search(){
        typeOnInputBox("#twotabsearchtextbox", "Laptop");
    }

}
