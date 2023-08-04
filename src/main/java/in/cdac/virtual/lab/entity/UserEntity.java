package in.cdac.virtual.lab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.apache.guacamole.auth.jdbc.user.ModeledUser;
@Entity
public class UserEntity extends ModeledUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    // Add other user-related properties and getters/setters as needed

    @Override
    public String getIdentifier() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
    // Implement other methods of the User interface
}
