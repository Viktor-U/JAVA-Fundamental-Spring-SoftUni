package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.model.DTOs.UserRegistrationDTO;
import bg.softuni.mobilele.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        // TODO:

        System.out.println("The user received is: " + userRegistrationDTO);
    }
}
