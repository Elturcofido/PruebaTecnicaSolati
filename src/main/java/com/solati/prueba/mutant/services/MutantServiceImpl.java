package com.solati.prueba.mutant.services;


import com.solati.prueba.mutant.dto.MutantDto;
import com.solati.prueba.mutant.persistence.MutantEntity;
import com.solati.prueba.mutant.persistence.repository.MutantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MutantServiceImpl extends MutantValidate implements MutantService {

    private final MutantRepository mutantRepository;

    public MutantServiceImpl(MutantRepository mutantRepository) {
        this.mutantRepository = mutantRepository;
    }

    public boolean isMutant(MutantDto input) {

        Optional<MutantEntity> mutantEntityOptional = mutantRepository.findById(String.join("", input.dna));
        return mutantEntityOptional.map(mutantEntity -> mutantEntity.isMutant).orElseGet(() -> this.validateDNA(input.dna));

    }



}
