package com.costelmitrea.petclinic.services.map;

import com.costelmitrea.petclinic.model.VetSpeciality;
import com.costelmitrea.petclinic.services.SpecialityService;

import java.util.Set;

public class SpecialityServiceMap extends AbstractMapService<VetSpeciality, Long>
            implements SpecialityService {

    @Override
    public VetSpeciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public VetSpeciality save(VetSpeciality object) {
        return super.save(object);
    }

    @Override
    public Set<VetSpeciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(VetSpeciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
