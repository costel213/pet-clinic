package com.costelmitrea.petclinic.repositories;

import com.costelmitrea.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
