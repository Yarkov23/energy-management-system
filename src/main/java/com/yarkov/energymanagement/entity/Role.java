package com.yarkov.energymanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "role")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Role {

    @Id
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private Set<Account> accounts;

    @Column(name = "authority")
    private String authority;

}
