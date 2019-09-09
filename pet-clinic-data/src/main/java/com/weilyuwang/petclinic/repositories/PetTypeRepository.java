package com.weilyuwang.petclinic.repositories;

import com.weilyuwang.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
