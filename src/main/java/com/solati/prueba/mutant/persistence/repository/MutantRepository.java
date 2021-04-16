package com.solati.prueba.mutant.persistence.repository;

import com.solati.prueba.mutant.persistence.MutantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MutantRepository extends MongoRepository<MutantEntity, String> {
    Long countByIsMutant(boolean b);
}
	