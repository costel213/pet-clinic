package com.costelmitrea.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class VetSpeciality extends BaseEntity{

    @Column(name = "description")
    private String specialityName;
}
