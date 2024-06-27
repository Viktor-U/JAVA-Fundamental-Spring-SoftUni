package bg.softuni.mobilele.model.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserRegistrationDTO {

    @NotEmpty
    @Size(min = 5, max = 20)
    private String firstName;
    @NotEmpty
    @Size(min = 5, max = 20)
    private String lastName;
    @NotEmpty
    private String password;
    @Email
    private String email;

    public UserRegistrationDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + (password == null ? "N/A" : "[PROVIDED]") + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
