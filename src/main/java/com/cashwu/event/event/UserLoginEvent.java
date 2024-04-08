package com.cashwu.event.event;

import org.springframework.context.ApplicationEvent;

public class UserLoginEvent extends ApplicationEvent {

    public UserLoginEvent(UserLoginEventData source) {
        super(source);
    }
}

