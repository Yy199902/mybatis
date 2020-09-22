package com.example.mybatis.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class MyPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    /**
     * 发布事件
     * 监听该事件的监听者都可以获取消息
     *
     * @param myEvent
     */
    public void publisherEvent(ApplicationEvent myEvent) {
        System.out.println("---开始发布 myEvent 事件---");

        applicationContext.publishEvent(myEvent);
    }
}
