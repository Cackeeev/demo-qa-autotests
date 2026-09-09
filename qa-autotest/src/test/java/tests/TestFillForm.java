package tests;

import baseTest.BaseTest;
import models.User;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.PageFillForm;
import utils.UserRandom;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.UserRandom.randomUser;

public class TestFillForm extends BaseTest {
    @Test
    void testFillForm(){
        PageFillForm pageFillForm = new PageFillForm(driver);

        User user = randomUser();

        pageFillForm.open()
                .fillForm(user)
                .submitButton();

        assertTrue(pageFillForm.modalSucces());
    }
}
