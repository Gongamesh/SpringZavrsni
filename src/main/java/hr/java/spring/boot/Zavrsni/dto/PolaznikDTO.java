package hr.java.spring.boot.Zavrsni.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolaznikDTO {
    @NotBlank(message = "Polaznik name cannot be blank")
    private String polaznikName;

    @NotBlank(message = "Polaznik surname cannot be blank")
    private String polaznikSurname;
}
