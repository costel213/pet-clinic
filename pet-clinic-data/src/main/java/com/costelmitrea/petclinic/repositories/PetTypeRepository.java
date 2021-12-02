package com.costelmitrea.petclinic.repositories;

import com.costelmitrea.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
