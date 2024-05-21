package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;

public class PO_Home extends FW_Page {

    private static final String LO_LNK_BING_LOGO  = "//*[name()='svg' and @id='bLogo']";
    private static final String LO_EDT_SEARCH = "//textarea[@name='q']";
    private static final String LO_BING_SEARCH_ICON= "//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']";

    public PO_Home(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage(){
        return validateLocatorExists(LO_LNK_BING_LOGO, 10, 1);
    }

    public String enterSearch(String search){
        String result = setText(LO_EDT_SEARCH, search, 10, false);
        typeOnKeyboard("TAB"); // Close the dropdown if it exists
        return result;
    }

    public String clickBingSearchIcon(){
        return clickLocator(LO_BING_SEARCH_ICON, 10);
    }

    public String clickBaseGoogleSearch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickBaseGoogleSearch'");
    }

}