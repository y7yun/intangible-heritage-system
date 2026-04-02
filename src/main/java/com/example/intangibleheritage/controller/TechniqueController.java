package com.example.intangibleheritage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/techniques")
public class TechniqueController {

    // Assume there's a TechniqueService for handling logic
    private final TechniqueService techniqueService;

    public TechniqueController(TechniqueService techniqueService) {
        this.techniqueService = techniqueService;
    }

    @PostMapping
    public ResponseEntity<Technique> createTechnique(@RequestBody Technique technique) {
        Technique createdTechnique = techniqueService.createTechnique(technique);
        return ResponseEntity.ok(createdTechnique);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Technique> getTechniqueById(@PathVariable Long id) {
        Technique technique = techniqueService.getTechniqueById(id);
        return ResponseEntity.ok(technique);
    }

    @GetMapping
    public ResponseEntity<List<Technique>> getAllTechniques() {
        List<Technique> techniques = techniqueService.getAllTechniques();
        return ResponseEntity.ok(techniques);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Technique> updateTechnique(@PathVariable Long id, @RequestBody Technique technique) {
        Technique updatedTechnique = techniqueService.updateTechnique(id, technique);
        return ResponseEntity.ok(updatedTechnique);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTechnique(@PathVariable Long id) {
        techniqueService.deleteTechnique(id);
        return ResponseEntity.noContent().build();
    }
}