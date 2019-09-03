package com.weilyuwang.petclinic.services;

import java.util.Set;


//use generic types to implement the base service interface
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
