package com.costelmitrea.petclinic.repositories;

import com.costelmitrea.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
