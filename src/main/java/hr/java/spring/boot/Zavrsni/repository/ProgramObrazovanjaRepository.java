package hr.java.spring.boot.Zavrsni.repository;

import hr.java.spring.boot.Zavrsni.domain.ProgramObrazovanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramObrazovanjaRepository extends JpaRepository<ProgramObrazovanja, Integer> {
}
