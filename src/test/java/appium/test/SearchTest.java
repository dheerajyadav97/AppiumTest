package appium.test;

import appium.utility.Utilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import io.appium.java_client.touch.offset.PointOption;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends LaunchApp {

    @Test(enabled = true)
    public void myFirstTest() throws InterruptedException {
        TouchAction touchAction = new TouchAction(LaunchApp.driver);
        LaunchApp.driver.resetApp();
        Thread.sleep(10000);

        String firstPopUp = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/hi_i_m_mees").getText();
        Thread.sleep(3000);
        Assert.assertEquals(firstPopUp, "Hi,I’m Meesha.");

        MobileElement element_female = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/img_female");
        Assert.assertTrue(Utilities.isClickable(element_female, driver));
        element_female.click();
        Thread.sleep(1000);

        System.out.println("Click of first pOp up Assert is pass");


        MobileElement element_search = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/query_edit_text");
        Assert.assertTrue(Utilities.isClickable(element_search, driver));
        element_search.click();
        Thread.sleep(5000);

        LaunchApp.driver.findElementById("com.meesho.supply.debug:id/query_edit_text").sendKeys("Saree");
        Thread.sleep(5000);
        touchAction.tap(PointOption.point(934, 2072)).perform();
        Thread.sleep(5000);


        // Clicking on saree image
        MobileElement saree_product_image = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/catalog_cover");
        Assert.assertTrue(Utilities.isClickable(saree_product_image, driver));
        saree_product_image.click();
        Thread.sleep(10000);

        // View button Click
        MobileElement view_detail_click = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/view_details");
        Assert.assertTrue(Utilities.isClickable(view_detail_click, driver));
        view_detail_click.click();
        Thread.sleep(10000);

        //Buy now button
        MobileElement buy_now_button = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/buy_now");
        Assert.assertTrue(Utilities.isClickable(buy_now_button, driver));
        buy_now_button.click();
        Thread.sleep(10000);

        //Continue button
        MobileElement continue_button = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/primary_cta");
        Assert.assertTrue(Utilities.isClickable(continue_button, driver));
        continue_button.click();
        Thread.sleep(10000);

        //Cross button
        MobileElement cross_bottom = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/close");
        Assert.assertTrue(Utilities.isClickable(cross_bottom, driver));
        cross_bottom.click();
        Thread.sleep(10000);

    }
}
