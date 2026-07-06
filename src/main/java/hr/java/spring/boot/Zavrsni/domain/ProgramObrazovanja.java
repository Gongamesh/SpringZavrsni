package hr.java.spring.boot.Zavrsni.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ProgramObrazovanja")
public class ProgramObrazovanja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProgramObrazovanjaID")
    private Integer id;

    @Column(name = "Naziv")
    private String name;

    @Column(name = "CSVET")
    private Integer csvet;

    @OneToMany(mappedBy = "programObrazovanja")
    private List<Upis> upisList = new ArrayList<>();
}
