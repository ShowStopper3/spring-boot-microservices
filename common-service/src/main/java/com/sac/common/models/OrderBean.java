package com.sac.common.models;


import com.sac.common.enums.OrderEnums;

import java.util.Set;

public class OrderBean {

    private Long customerId;
    private Long orderId;
    private Double cost;
    private Set<ItemsBean> items;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Set<ItemsBean> getItems() {
        return items;
    }

    public void setItems(Set<ItemsBean> items) {
        this.items = items;
    }
}
