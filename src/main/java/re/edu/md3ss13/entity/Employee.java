package re.edu.md3ss13.entity;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Employee {
    private String id;
    private String fullName;
    private Double salary;
}
