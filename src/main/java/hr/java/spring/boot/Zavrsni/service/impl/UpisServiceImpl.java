package hr.java.spring.boot.Zavrsni.service.impl;

import hr.java.spring.boot.Zavrsni.domain.Upis;
import hr.java.spring.boot.Zavrsni.dto.UpisDTO;
import hr.java.spring.boot.Zavrsni.repository.UpisRepository;
import hr.java.spring.boot.Zavrsni.service.UpisService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UpisServiceImpl implements UpisService {

    private UpisRepository upisRepository;

    @Override
    public List<UpisDTO> getAllUpis() {
        return upisRepository.findAll()
                .stream()
                .map(this::convertUpistoUpisDTO)
                .toList();
    }

    @Override
    public Optional<UpisDTO> getUpisById(Integer upisId) {
        Optional<Upis> optionalUpis = upisRepository.findById(upisId);

        if (optionalUpis.isPresent()) {
            return Optional.of(convertUpistoUpisDTO(optionalUpis.get()));
        }

        return Optional.empty();
    }

    private UpisDTO convertUpistoUpisDTO(Upis upis) {
        return new UpisDTO(upis.getProgramObrazovanja().getId(),
                upis.getPolaznik().getId());
    }
}
