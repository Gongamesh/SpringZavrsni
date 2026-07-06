package hr.java.spring.boot.Zavrsni.service.impl;

import hr.java.spring.boot.Zavrsni.domain.Polaznik;
import hr.java.spring.boot.Zavrsni.dto.PolaznikDTO;
import hr.java.spring.boot.Zavrsni.repository.PolaznikRepository;
import hr.java.spring.boot.Zavrsni.service.PolaznikService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PolaznikServiceImpl implements PolaznikService {

    private PolaznikRepository polaznikRepository;

    @Override
    public List<PolaznikDTO> getAllPolaznik() {
        return polaznikRepository.findAll()
                .stream()
                .map(this::convertPolaznikToPolaznikDTO)
                .toList();
    }

    @Override
    public Optional<PolaznikDTO> getPolaznikById(Integer polaznikId) {
        Optional<Polaznik> optionalPolaznik = polaznikRepository.findById(polaznikId);

        if (optionalPolaznik.isPresent()) {
            return Optional.of(convertPolaznikToPolaznikDTO(optionalPolaznik.get()));
        }

        return Optional.empty();
    }

    private PolaznikDTO convertPolaznikToPolaznikDTO(Polaznik polaznik) {
        return new PolaznikDTO(polaznik.getName(),
                polaznik.getSurname());
    }
}
