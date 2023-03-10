package com.yarkov.energymanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "tariff")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Tariff {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "price")
    private Long price;

    @Column(name = "tariffCondition")
    private String tariffCondition;

    @OneToMany(mappedBy = "tariff")
    private Set<ResourceCompany> resourceCompanies;

}
