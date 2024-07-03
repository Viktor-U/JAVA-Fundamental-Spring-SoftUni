package bg.softuni.mobilele.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class MobileleUserDetails extends User {

    private final String firstName;
    private final String lastName;

    public MobileleUserDetails(
            String username,
            String password,
            Collection<? extends GrantedAuthority> authorities,
            String firstName,
            String lastName) {
        super(username, password, authorities);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null){
            sb.append(firstName);
        }
        if (lastName != null){
            if (!sb.isEmpty()){
                sb.append(" ");
            }
            sb.append(lastName);
        }
        return sb.toString();
    }

}
