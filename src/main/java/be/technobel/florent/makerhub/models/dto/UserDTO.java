package be.technobel.florent.makerhub.models.dto;

import be.technobel.florent.makerhub.models.entity.users.User;
import lombok.Data;

@Data
public class UserDTO {
    private final Long id;
    private final String role;
    private final String firstName;
    private final String lastName;
    private final String email;
    public static UserDTO toDto(User entity) {
        if( entity == null )
            return null;

        return new UserDTO(
                entity.getId(),
                entity.getRole(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail()
        );
    }

}
