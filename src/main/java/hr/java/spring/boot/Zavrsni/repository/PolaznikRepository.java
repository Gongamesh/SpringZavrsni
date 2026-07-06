package hr.java.spring.boot.Zavrsni.repository;

import hr.java.spring.boot.Zavrsni.domain.Polaznik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolaznikRepository  extends JpaRepository<Polaznik, Integer> {

}
