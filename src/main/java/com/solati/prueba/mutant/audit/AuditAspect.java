package com.solati.prueba.mutant.audit;


import com.solati.prueba.mutant.dto.MutantDto;
import com.solati.prueba.mutant.persistence.MutantEntity;
import com.solati.prueba.mutant.persistence.repository.MutantRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;


@Aspect
@Component
public class AuditAspect {

    private final MutantRepository repository;

    public AuditAspect(MutantRepository repository) {
        this.repository = repository;
    }

    @Around("execution(* com.mutant.services.MutantServiceImpl.*(..))")
    public Object audit(ProceedingJoinPoint joinPoint) throws Throwable {
        Boolean result = (Boolean) joinPoint.proceed();
        saveMutant((MutantDto) joinPoint.getArgs()[0], result);
        return result;
    }

    @Async
    void saveMutant(MutantDto domain, boolean isMutant) {
        repository.save(MutantEntity.builder().dna(domain.dna.stream().collect(Collectors.joining())).isMutant(isMutant).build());
    }

}
