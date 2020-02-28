package com.sac.customer.entity;



import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_ORDERS")
@SequenceGenerator(name = "CUSTOMER_ORDERS_SEQ", sequenceName = "CUSTOMER_ORDERS_SEQ", allocationSize = 1)
public class CustomerOrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_ORDERS_SEQ")
    private Long id;

    private Long customerId;
    private Long orderId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


}
