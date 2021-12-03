package com.costelmitrea.petclinic.services.springdatajpa;

import com.costelmitrea.petclinic.model.VetSpeciality;
import com.costelmitrea.petclinic.repositories.SpecialityRepository;
import com.costelmitrea.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile({"springdatajpa"})
public class SpecialitySDJpaService implements SpecialityService {

    private SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public VetSpeciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public VetSpeciality save(VetSpeciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public Set<VetSpeciality> findAll() {
        Set<VetSpeciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(VetSpeciality object) {
        delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        deleteById(aLong);
    }
}
