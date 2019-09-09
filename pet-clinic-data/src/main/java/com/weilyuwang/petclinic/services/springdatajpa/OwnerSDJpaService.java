package com.weilyuwang.petclinic.services.springdatajpa;

import com.weilyuwang.petclinic.model.Owner;
import com.weilyuwang.petclinic.repositories.OwnerRepository;
import com.weilyuwang.petclinic.repositories.PetRepository;
import com.weilyuwang.petclinic.repositories.PetTypeRepository;
import com.weilyuwang.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

// SDJpa -> Spring Data JPA
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        //ownerRepository.findById(aLong) is gonna return an Optional object, need get() to get the ID value
        Optional<Owner> optionalOwner =  ownerRepository.findById(aLong);
        return optionalOwner.orElse(null);//return ID val if present otherwise null
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
