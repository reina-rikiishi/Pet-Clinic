package com.weilyuwang.petclinic.repositories;

import com.weilyuwang.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    //dynamic query method/finder
    //all we need is to set up the method name (findBy.../findAll..) and then Spring Data JPA is going to provide
    //us with the implementation -- fetch data from the database.
    Owner findByLastName(String lastName);

}
