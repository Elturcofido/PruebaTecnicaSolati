package com.solati.prueba.mutant.controller;

import com.solati.prueba.mutant.dto.StatDto;
import com.solati.prueba.mutant.services.StatMutantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatMutantService statMutantService;

    StatsController(StatMutantService statMutantService) {
        this.statMutantService = statMutantService;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<StatDto> stats() {
        return ResponseEntity.ok().body(statMutantService.stat());
    }
}
