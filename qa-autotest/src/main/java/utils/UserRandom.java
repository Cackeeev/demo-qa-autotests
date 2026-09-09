package utils;

import com.github.javafaker.Faker;
import models.User;

public class UserRandom {
    private static final Faker faker = new Faker();

    public static User randomUser() {
        return new User(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().subscriberNumber(10),
                "Male"
        );
    }
}
