package hr.java.spring.boot.Zavrsni.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramObrazovanjaDTO {
    @NotBlank(message = "Program obazovanja name cannot be blank")
    private String programObrazovanjaName;

    @NotNull(message = "Program obrazovanja CSVET cannot be blank")
    @PositiveOrZero(message = "Program obrazovanja CSVET must be positive")
    private Integer programObrazovanjaCsvet;
}
