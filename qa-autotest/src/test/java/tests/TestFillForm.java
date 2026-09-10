package tests;

import baseTest.BaseTest;
import models.User;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.PageFillForm;
import utils.UserRandom;

import static org.junit.jupiter.api.Assertions.*;
import static utils.UserRandom.randomUser;

public class TestFillForm extends BaseTest {
    @Test
    void testFillForm() {
        PageFillForm pageFillForm = new PageFillForm(driver);

        User user = randomUser();

        pageFillForm.open()
                .fillForm(user)
                .submitButton();

        assertAll(
                () -> assertTrue(pageFillForm.modalSucces()),
                () -> assertEquals(user.getFirstName() + " " + user.getLastName(), pageFillForm.getStudentName("Student Name")),
                () -> assertEquals(user.getEmail(), pageFillForm.getStudentEmail("Student Email")),
                () -> assertEquals(user.getGender(), pageFillForm.getStudentGender("Gender")),
                () -> assertEquals(user.getNumber(), pageFillForm.getStudentMobile("Mobile"))

        );
    }
}
