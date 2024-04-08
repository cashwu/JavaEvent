package com.cashwu.event.controller;

import com.cashwu.event.dto.LoginReq;
import com.cashwu.event.event.AppEvent;
import com.cashwu.event.event.UserLoginEvent;
import com.cashwu.event.event.UserLoginEventData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cash.wu
 * @since 2024/04/08
 */
@RestController
@Slf4j
@EnableAsync
public class HomeController {

    final AppEvent appEvent;

    public HomeController(AppEvent appEvent) {
        this.appEvent = appEvent;
    }

    @PostMapping("/login")
    public String Login(@RequestBody LoginReq loginReq){

        log.info("loginReq : {}", loginReq);

        appEvent.publisher(new UserLoginEvent(new UserLoginEventData(loginReq.userName())));

        return "ok";
    }
}

