package com.weilyuwang.petclinic.repositories;

import com.weilyuwang.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
