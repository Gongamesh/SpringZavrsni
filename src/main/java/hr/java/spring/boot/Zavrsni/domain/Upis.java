package hr.java.spring.boot.Zavrsni.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Upis")
public class Upis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UpisID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "IDProgramObrazovanja")
    private ProgramObrazovanja programObrazovanja;

    @ManyToOne
    @JoinColumn(name = "IDPolaznik")
    private Polaznik polaznik;
}
