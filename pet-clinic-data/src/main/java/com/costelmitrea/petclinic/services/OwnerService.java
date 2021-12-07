package com.costelmitrea.petclinic.services;

import com.costelmitrea.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
