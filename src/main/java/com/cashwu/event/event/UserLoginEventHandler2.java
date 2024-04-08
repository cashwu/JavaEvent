package com.cashwu.event.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserLoginEventHandler2 implements ApplicationListener<UserLoginEvent> {

    @Override
    public void onApplicationEvent(UserLoginEvent event) {

        log.info("UserLoginEventHandler2 handler : {}", event);
    }
}
