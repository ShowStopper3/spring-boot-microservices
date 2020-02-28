package com.sac.customer.events.listener;


import com.sac.common.models.OrderEventBean;
import com.sac.customer.events.CustomerEventSink;
import com.sac.customer.events.handlers.EventHandler;
import com.sac.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;


@EnableBinding(CustomerEventSink.class)
public class EventListener {
    private static final Logger logger = LoggerFactory.getLogger(EventListener.class);
    @Autowired
    private CustomerService customerService;

    @Autowired
    private EventHandler handler;

    @StreamListener(target = CustomerEventSink.channel)
    public void processEvent(OrderEventBean orderEventBean) {
        switch (orderEventBean.getAction()) {

            case CREATE:
                handler.CreateCustomerOrder(orderEventBean);
                break;

            case UPDATE:
                logger.debug("update");
                break;
            default:
                logger.debug("Received");
                break;
        }


    }
}
