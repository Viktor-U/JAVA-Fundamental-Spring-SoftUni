package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.model.Entity.UserEntity;
import bg.softuni.mobilele.model.MobileleUserDetails;
import bg.softuni.mobilele.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public class MobileleUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public MobileleUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        return userRepository
                        .findByEmail(email)
                        .map(MobileleUserDetailsService::map)
                        .orElseThrow(() -> new UsernameNotFoundException("User with email " + email + " not found!" ));

    }

    private static UserDetails map(UserEntity userEntity) {
        return new MobileleUserDetails(
            userEntity.getEmail(),
            userEntity.getPassword(),
            List.of(),//todo
            userEntity.getFirstName(),
            userEntity.getLastName()
        );
    }
}
