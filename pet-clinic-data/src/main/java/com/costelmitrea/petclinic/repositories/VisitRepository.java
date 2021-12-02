package com.costelmitrea.petclinic.repositories;

import com.costelmitrea.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
