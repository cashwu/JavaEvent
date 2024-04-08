package com.cashwu.event.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableAsync
public class UserLoginEventHandler2 implements ApplicationListener<UserLoginEvent> {

    @Async
    @Override
    public void onApplicationEvent(UserLoginEvent event) {

        log.info("event handler received : {}", event.getSource());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info("event handler down");
    }
}
