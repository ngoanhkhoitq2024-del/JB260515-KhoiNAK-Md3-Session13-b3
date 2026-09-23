package re.edu.md3ss13.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private String role;
    private boolean enabled = true;

}
