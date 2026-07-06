package hr.java.spring.boot.Zavrsni.service;

import hr.java.spring.boot.Zavrsni.dto.ProgramObrazovanjaDTO;

import java.util.List;
import java.util.Optional;

public interface ProgramObrazovanjaService {
    List<ProgramObrazovanjaDTO> getAllProgramObrazovanja();
    Optional<ProgramObrazovanjaDTO> getProgramObrazovanjaById(Integer programObrazovanjaId);
}
