package com.sac.customer.entity;


import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
@SequenceGenerator(name = "CUSTOMER_SEQ", sequenceName = "CUSTOMER_SEQ", allocationSize = 1)
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ")
    private Long customerId;

    private String name;


    public Long getId() {
        return customerId;
    }

    public void setId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
