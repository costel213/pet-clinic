package com.costelmitrea.petclinic.repositories;

import com.costelmitrea.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
