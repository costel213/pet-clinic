package com.costelmitrea.petclinic.services.map;

import com.costelmitrea.petclinic.model.Vet;
import com.costelmitrea.petclinic.model.VetSpeciality;
import com.costelmitrea.petclinic.services.SpecialityService;
import com.costelmitrea.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long>
                            implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getVetSpecialities().size() > 0) {
            object.getVetSpecialities().forEach(speciality -> {
                if(speciality.getId() == null) {
                    VetSpeciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
