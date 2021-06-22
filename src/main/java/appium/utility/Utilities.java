package appium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

    /**
     * @param element
     * @param driver
     * @return
     */
    public static boolean isClickable(WebElement element, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
