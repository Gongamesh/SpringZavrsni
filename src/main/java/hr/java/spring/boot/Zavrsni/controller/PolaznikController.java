package hr.java.spring.boot.Zavrsni.controller;

import hr.java.spring.boot.Zavrsni.dto.PolaznikDTO;
import hr.java.spring.boot.Zavrsni.service.PolaznikService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/polaznik")
@AllArgsConstructor
public class PolaznikController {

    private PolaznikService polaznikService;

    @GetMapping
    public ResponseEntity<?> getAllPolaznik() {
        List<PolaznikDTO> polaznikDTOList = polaznikService.getAllPolaznik();

        return ResponseEntity.ok(polaznikDTOList);
    }

    @GetMapping("/{polaznikId}")
    public ResponseEntity<?> getPolaznikById(@PathVariable Integer polaznikId) {
        Optional<PolaznikDTO> optional = polaznikService.getPolaznikById(polaznikId);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }

        return ResponseEntity.notFound().build();
    }
}
