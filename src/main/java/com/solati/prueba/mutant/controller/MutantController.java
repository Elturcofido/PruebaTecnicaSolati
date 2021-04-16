package com.solati.prueba.mutant.controller;


import com.solati.prueba.mutant.dto.MutantDto;
import com.solati.prueba.mutant.exception.RestException;
import com.solati.prueba.mutant.services.MutantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutantController {

    private final MutantService service;

    public MutantController(MutantService service) {
        this.service = service;
    }


    @PostMapping(path = "/mutant", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> isMutant(@RequestBody MutantDto input) {

        if (!input.dna.stream().allMatch(s -> s.matches("[(ACGT)+]{6}"))) {
            throw new RestException(HttpStatus.BAD_REQUEST, "Input format violation");
        }

        if (service.isMutant(input)) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

}
