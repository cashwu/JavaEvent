package com.cashwu.event.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/08
 */
@Service
@EnableAsync
public class AppEvent implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    //    private final ApplicationEventPublisher publisher;
//
//    public AppEvent(ApplicationEventPublisher publisher) {
//        this.publisher = publisher;
//    }
//
    @Async
    public void publisher(ApplicationEvent event){
        this.applicationEventPublisher.publishEvent(event);;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
       this.applicationEventPublisher = applicationEventPublisher;
    }
}

