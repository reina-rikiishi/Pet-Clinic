package com.weilyuwang.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id; //prefer boxed types to primitives(long) for hibernate, in that boxed types can be Null whereas primitive types cannot.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
