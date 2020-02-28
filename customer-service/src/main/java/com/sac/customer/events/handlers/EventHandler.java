package com.sac.customer.events.handlers;


import com.sac.common.enums.OrderEnums;
import com.sac.common.models.CustomerOrdersBean;
import com.sac.common.models.OrderEventBean;
import com.sac.customer.events.OrderEventSource;
import com.sac.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(OrderEventSource.class)
public class EventHandler {
    private static final Logger logger = LoggerFactory.getLogger(EventHandler.class);
    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderEventSource orderEventSource;

    public void CreateCustomerOrder(OrderEventBean orderEventBean) {
        CustomerOrdersBean customerOrder = new CustomerOrdersBean();
        customerOrder.setCustomerId(orderEventBean.getCustomerId());
        customerOrder.setOrderId(orderEventBean.getOrderId());
        customerService.createCustomerOrder(customerOrder);
        orderEventBean.setAction(OrderEnums.UPDATE);
        publishEvent(orderEventBean);
    }

    public void publishEvent(OrderEventBean model) {
        orderEventSource.OrderEventsChannel().send(MessageBuilder.withPayload(model).build());

    }
}
