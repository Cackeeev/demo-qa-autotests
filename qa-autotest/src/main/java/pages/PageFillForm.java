package pages;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageFillForm {
    private WebDriver driver;
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");
    private By userNumber = By.id("userNumber");

    private By userGender(String gender) {
        return By.xpath("//label[text()='" + gender + "']");
    }

    private By submit = By.id("submit");
    private By modalTrue = By.id("example-modal-sizes-title-lg");

    public PageFillForm(WebDriver driver) {
        this.driver = driver;
    }

    public PageFillForm open() {
        driver.get("https://demoqa.com/automation-practice-form");
        return this;
    }

    public PageFillForm fillForm(User user) {
        driver.findElement(firstName).sendKeys(user.getFirstName());
        driver.findElement(lastName).sendKeys(user.getLastName());
        driver.findElement(userEmail).sendKeys(user.getEmail());
        driver.findElement(userNumber).sendKeys(user.getNumber());
        driver.findElement(userGender(user.getGender())).click();
        return this;
    }

    public PageFillForm submitButton() {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'})", driver.findElement(submit));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click()", driver.findElement(submit));
        return this;
    }

    public boolean modalSucces() {
        return driver.findElement(modalTrue).isDisplayed();
    }

}
