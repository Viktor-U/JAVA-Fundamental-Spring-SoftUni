package bg.softuni.mobilele.model.DTOs;

public record UserRegistrationDTO(String firstName,
                                  String lastName,
                                  String password,
                                  String email) {
}
