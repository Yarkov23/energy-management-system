package com.yarkov.energymanagement.entity.id;

import jakarta.persistence.Embeddable;

import java.io.Serializable;


@Embeddable
public class ResourceCompanyId implements Serializable {
    private Long companyId;

    private Long resourceId;

    private Integer expenseMonth;

    private Integer expenseYear;

}
