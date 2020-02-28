package com.sac.order.events.listener;


import com.sac.common.models.OrderEventBean;
import com.sac.order.events.OrderEventSink;
import com.sac.order.events.handlers.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;


@EnableBinding(OrderEventSink.class)
public class EventListener {
    private static final Logger logger = LoggerFactory.getLogger(EventListener.class);


    @Autowired
    private EventHandler handler;

    @StreamListener(target = OrderEventSink.channel)
    public void processEvent(OrderEventBean orderEventBean) {
        switch (orderEventBean.getAction()) {

            case UPDATE:
                handler.updateEvent(orderEventBean);
                break;
            case CREATE:
                logger.debug("Created");
                break;
            default:
                logger.debug("Received");
                break;
        }


    }
}
