package com.weilyuwang.petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@MappedSuperclass //this is saying "hey JPA, we're going to inherit from this class or other classes are going to inheriting it"
public class BaseEntity implements Serializable {

    @Id //this annotation tells JPA that this is the ID value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //prefer boxed types to primitives(long) for hibernate, in that boxed types can be Null whereas primitive types cannot.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
