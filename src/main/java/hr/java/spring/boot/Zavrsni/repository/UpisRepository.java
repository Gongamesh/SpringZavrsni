package hr.java.spring.boot.Zavrsni.repository;

import hr.java.spring.boot.Zavrsni.domain.Upis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpisRepository extends JpaRepository<Upis, Integer> {
}
