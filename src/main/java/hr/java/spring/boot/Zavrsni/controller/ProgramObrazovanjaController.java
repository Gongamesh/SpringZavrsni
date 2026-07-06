package hr.java.spring.boot.Zavrsni.controller;

import hr.java.spring.boot.Zavrsni.dto.ProgramObrazovanjaDTO;
import hr.java.spring.boot.Zavrsni.service.ProgramObrazovanjaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/programObrazovanja")
@AllArgsConstructor
public class ProgramObrazovanjaController {

    private ProgramObrazovanjaService programObrazovanjaService;

    @GetMapping
    public ResponseEntity<?> getAllProgramObrazovanja() {
        List<ProgramObrazovanjaDTO> programObrazovanjaList = programObrazovanjaService.getAllProgramObrazovanja();

        return ResponseEntity.ok(programObrazovanjaList);
    }

    @GetMapping("/{programObrazovanjaId}")
    public ResponseEntity<?> getProgramObrazovanjaById(@PathVariable Integer programObrazovanjaId) {
        Optional<ProgramObrazovanjaDTO> optional = programObrazovanjaService.getProgramObrazovanjaById(programObrazovanjaId);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }

        return ResponseEntity.notFound().build();
    }
}
