package hr.java.spring.boot.Zavrsni.controller;

import hr.java.spring.boot.Zavrsni.dto.UpisDTO;
import hr.java.spring.boot.Zavrsni.service.UpisService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/upis")
@AllArgsConstructor
public class UpisController {

    private UpisService upisService;

    @GetMapping
    public ResponseEntity<?> getAllUpis() {
        List<UpisDTO> list = upisService.getAllUpis();

        return ResponseEntity.ok(list);
    }

    @GetMapping("/{upisId}")
    public ResponseEntity<?> getUpisById(@PathVariable Integer upisId) {
        Optional<UpisDTO> optional = upisService.getUpisById(upisId);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }

        return ResponseEntity.notFound().build();
    }
}
