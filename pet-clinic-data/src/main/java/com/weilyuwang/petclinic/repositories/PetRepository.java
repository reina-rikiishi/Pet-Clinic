package com.weilyuwang.petclinic.repositories;

import com.weilyuwang.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
