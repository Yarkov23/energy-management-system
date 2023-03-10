package com.yarkov.energymanagement.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "expenses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Expense {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @Column(name = "useAmount")
    private Double useAmount;

    @Column(name = "expensesYear")
    private Integer expensesYear;

    @Column(name = "expensesMonth")
    private Integer expensesMonth;

}
