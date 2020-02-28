package com.sac.common.models;

import com.sac.common.enums.OrderEnums;

public class OrderEventModel {
    private Long customerId;
    private OrderEnums status;
    private Long orderId;

    public OrderEnums getAction() {
        return action;
    }

    public void setAction(OrderEnums action) {
        this.action = action;
    }

    private OrderEnums action;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public OrderEnums getStatus() {
        return status;
    }

    public void setStatus(OrderEnums status) {
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
