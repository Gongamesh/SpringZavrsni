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
@Table(name = "Polaznik")
public class Polaznik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPolaznik")
    private Integer id;

    @Column(name = "Ime")
    private String name;

    @Column(name = "Prezime")
    private String surname;

    @OneToMany(mappedBy = "polaznik")
    private List<Upis> upisList = new ArrayList<>();
}
