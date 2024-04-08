package com.cashwu.event.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/08
 */
@Service
@Slf4j
@EnableAsync
public class UserLoginEventHandler {

    @Async
    @EventListener
    public void handle(UserLoginEvent userLoginEvent) {


        UserLoginEventData source = (UserLoginEventData) userLoginEvent.getSource();

        log.info("event handler received : {}", source);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info("event handler down");
    }
}

