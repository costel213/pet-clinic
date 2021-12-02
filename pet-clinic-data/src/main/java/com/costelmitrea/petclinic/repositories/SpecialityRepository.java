package com.costelmitrea.petclinic.repositories;

import com.costelmitrea.petclinic.model.VetSpeciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<VetSpeciality, Long> {
}
