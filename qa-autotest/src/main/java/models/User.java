package models;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String number;
    private String gender;

    public User(String firstName, String lastName,
                String email, String number, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getGender() {
        return gender;
    }
}
