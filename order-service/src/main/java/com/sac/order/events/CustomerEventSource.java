package com.sac.order.events;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerEventSource {
    @Output("CustomerEventsChannel")
    MessageChannel CustomerEventsChannel();
}
