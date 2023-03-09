package com.example.energymanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "resources")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Resource {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "resourceName")
    private String resourceName;

    @Column(name = "units")
    private String unit;

    @OneToMany(mappedBy = "resource")
    private Set<ResourceCompany> resourceCompanies;

    @OneToMany(mappedBy = "resource")
    private Set<Expense> resources;

}
