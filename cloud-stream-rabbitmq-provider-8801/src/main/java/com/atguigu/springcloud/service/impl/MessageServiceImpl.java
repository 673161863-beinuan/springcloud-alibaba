package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageService;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Date;
import java.util.UUID;

/**
 * @Classname MessageServiceImpl
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 12:30
 */
@EnableBinding(Source.class)
public class MessageServiceImpl implements IMessageService {


    @Autowired
    private MessageChannel output;

    @Override
    public String sendMessage() {

        // 发送的内容
        String serialNum = UUID.randomUUID().toString();
        // 发送出消息
        output.send(MessageBuilder.withPayload(serialNum).build());
        System.out.println("******" + new Date() + "\t" + serialNum);
        return null;
    }
}
