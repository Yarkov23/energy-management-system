package com.yarkov.energymanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hierarchy_level", referencedColumnName = "id")
    private Company hierarchyLevel;

    @OneToMany(mappedBy = "company")
    private Set<Expense> expenses;

    @OneToMany(mappedBy = "company")
    private Set<Account> accounts;
}
