package pt.saraborges.smartsplitnotifications.entity.users;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Getter
    @Setter
    private String email;
}