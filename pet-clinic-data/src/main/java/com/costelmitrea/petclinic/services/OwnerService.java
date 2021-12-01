package com.costelmitrea.petclinic.services;

import com.costelmitrea.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
