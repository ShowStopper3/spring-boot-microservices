package com.sac.customer.events;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OrderEventSource {
    @Output("OrderEventsChannel")
    MessageChannel OrderEventsChannel();
}
