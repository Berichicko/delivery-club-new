package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Test;

public class DeliveryClubTest extends Base {

    @Test
    public void testTitle() {
        Assert.assertTrue(homePage.getTitle());
    }

    @Test
    public void testText() {
        Assert.assertTrue(homePage.getText());
    }
}
