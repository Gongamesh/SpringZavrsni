package hr.java.spring.boot.Zavrsni.service;

import hr.java.spring.boot.Zavrsni.dto.UpisDTO;

import java.util.List;
import java.util.Optional;

public interface UpisService {
    List<UpisDTO> getAllUpis();
    Optional<UpisDTO> getUpisById(Integer upisId);
}
