package by.zasinets.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageDelivery {
    private final WebDriver driver;

    public HomePageDelivery(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getText() {
        return driver.
                findElement(By.xpath("//h5[text()='Upload, collect, " +
                        "and transact rare digital art on the Liquid Network']"))
                .getText().startsWith("Upload, collect, and");
    }

    public boolean getTitle() {
        return driver
                .getTitle().contains("Raretoshi");
    }
}
