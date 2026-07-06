package hr.java.spring.boot.Zavrsni.service.impl;

import hr.java.spring.boot.Zavrsni.domain.ProgramObrazovanja;
import hr.java.spring.boot.Zavrsni.dto.ProgramObrazovanjaDTO;
import hr.java.spring.boot.Zavrsni.repository.ProgramObrazovanjaRepository;
import hr.java.spring.boot.Zavrsni.service.ProgramObrazovanjaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProgramObrazovanjaServiceImpl implements ProgramObrazovanjaService {

    private ProgramObrazovanjaRepository programObrazovanjaRepository;

    @Override
    public List<ProgramObrazovanjaDTO> getAllProgramObrazovanja() {
        return programObrazovanjaRepository.findAll()
                .stream()
                .map(this::convertPOToPODTO)
                .toList();
    }

    @Override
    public Optional<ProgramObrazovanjaDTO> getProgramObrazovanjaById(Integer programObrazovanjaId) {
        Optional<ProgramObrazovanja> optionalProgramObrazovanja = programObrazovanjaRepository.findById(programObrazovanjaId);

        if (optionalProgramObrazovanja.isPresent()) {
            return Optional.of(convertPOToPODTO(optionalProgramObrazovanja.get()));
        }

        return Optional.empty();
    }

    private ProgramObrazovanjaDTO convertPOToPODTO(ProgramObrazovanja programObrazovanja) {
        return new ProgramObrazovanjaDTO(programObrazovanja.getName(),
                programObrazovanja.getCsvet());
    }
}
