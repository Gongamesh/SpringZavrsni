package hr.java.spring.boot.Zavrsni.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpisDTO {
    @NotNull(message = "Program obrazovanja id in Upis cannot be blank")
    @Positive(message = "Program obrazovanja id in Upis must be positive")
    private Integer upisPOId;

    @NotNull(message = "Polaznik id in Upis cannot be blank")
    @Positive(message = "Polaznik id in Upis must be positive")
    private Integer upisPolaznkId;
}
