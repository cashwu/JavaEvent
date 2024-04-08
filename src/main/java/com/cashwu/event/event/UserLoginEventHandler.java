package com.cashwu.event.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/08
 */
@Service
@Slf4j
public class UserLoginEventHandler {

    @EventListener
    public void handle(UserLoginEvent userLoginEvent) {

        UserLoginEventData source = (UserLoginEventData) userLoginEvent.getSource();

        log.info("event handler : {}", source);
    }
}

