package com.solati.prueba.mutant.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatDto {

    public long countMutantDna;

    public long countHumanDna;

    public float ratio;

	
}
