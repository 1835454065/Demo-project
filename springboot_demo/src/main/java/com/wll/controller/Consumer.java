package com.wll.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "${activemq.topic}")
    public void readMessage(String text) {
        System.out.println("接收到消息：" + text);
    }
}
