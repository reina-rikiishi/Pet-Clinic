package com.weilyuwang.petclinic.services;

import com.weilyuwang.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

