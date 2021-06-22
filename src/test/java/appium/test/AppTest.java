package appium.test;

import appium.utility.Utilities;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.Assert;
import org.testng.annotations.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


public class AppTest extends LaunchApp {


    @Test(enabled = true)
    public void firstFlow() throws InterruptedException {
        TouchAction touchAction = new TouchAction(LaunchApp.driver);
        Thread.sleep(10000);

        //pop up click set up latter
        MobileElement pop_click = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/set_up_later_button");
        Assert.assertTrue(Utilities.isClickable(pop_click, driver));
        pop_click.click();
        Thread.sleep(10000);

        //img_video_full_thumbnail
        MobileElement video_thumbnail = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/img_video_full_thumbnail");
        Assert.assertTrue(Utilities.isClickable(video_thumbnail, driver));
        video_thumbnail.click();
        Thread.sleep(55000);
        touchAction.tap(PointOption.point(512, 2065)).perform();
        Thread.sleep(10000);


        //Select suit from home page
        MobileElement suit_catalog = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/iv_filter_background");
        Assert.assertTrue(Utilities.isClickable(suit_catalog, driver));
        suit_catalog.click();
        Thread.sleep(10000);

        touchAction.tap(PointOption.point(503, 1684)).perform();
        Thread.sleep(10000);

        //sort
        MobileElement sort = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/sort_button");
        Assert.assertTrue(Utilities.isClickable(sort, driver));
        sort.click();
        Thread.sleep(10000);

        //sort by new arrival
        MobileElement sort_by_new_arrival = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/sort_option2");
        Assert.assertTrue(Utilities.isClickable(sort_by_new_arrival, driver));
        sort_by_new_arrival.click();
        Thread.sleep(5000);


        //scrolling
        touchAction
                .longPress(PointOption.point(511, 1600))
                .moveTo(PointOption.point(511, 300))
                .release()
                .perform();
        Thread.sleep(1000);

        touchAction
                .longPress(PointOption.point(511, 800))
                .moveTo(PointOption.point(511, 300))
                .release()
                .perform();
        Thread.sleep(10000);

        //Download product
        MobileElement download_click = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/download");
        Assert.assertTrue(Utilities.isClickable(download_click, driver));
        download_click.click();
        Thread.sleep(5000);

        touchAction.tap(PointOption.point(512, 1296)).perform();
        Thread.sleep(10000);


        // click on OK button
        MobileElement ok_click = LaunchApp.driver.findElementById("com.meesho.supply.debug:id/download_status_okay");
        Assert.assertTrue(Utilities.isClickable(ok_click, driver));
        ok_click.click();

    }
}
