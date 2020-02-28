package com.sac.order.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface OrderEventSink {

    String channel = "OrderEventsChannel";
    @Input("OrderEventsChannel")
    MessageChannel OrderEventsChannel();
}
