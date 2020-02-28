package com.sac.customer.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerEventSink {

    String channel = "CustomerEventsChannel";
    @Input("CustomerEventsChannel")
    MessageChannel CustomerEventsChannel();
}
