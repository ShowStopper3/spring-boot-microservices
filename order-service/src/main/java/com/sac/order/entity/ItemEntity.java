package com.sac.order.entity;

import javax.persistence.*;

@Entity
@Table(name = "items")
@SequenceGenerator(name = "item_seq", sequenceName = "item_seq", allocationSize = 1)
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_SEQ")
    private Long id;
    private String itemName;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }





}
