package com.costelmitrea.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{

    private Set<VetSpeciality> vetSpecialities = new HashSet<>();

    public Set<VetSpeciality> getVetSpecialities() {
        return vetSpecialities;
    }

    public void setVetSpeciality(Set<VetSpeciality> vetSpecialities) {
        this.vetSpecialities = vetSpecialities;
    }
}
