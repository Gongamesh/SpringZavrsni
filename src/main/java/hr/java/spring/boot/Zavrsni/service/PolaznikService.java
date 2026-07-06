package hr.java.spring.boot.Zavrsni.service;

import hr.java.spring.boot.Zavrsni.dto.PolaznikDTO;

import java.util.List;
import java.util.Optional;

public interface PolaznikService {
    List<PolaznikDTO> getAllPolaznik();
    Optional<PolaznikDTO> getPolaznikById(Integer polaznikId);
}
