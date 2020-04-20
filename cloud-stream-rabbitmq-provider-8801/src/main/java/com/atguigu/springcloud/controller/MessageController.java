package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname MessageController
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 12:35
 */
@RestController
public class MessageController {


    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("/send/message")
    public String sendMessage() {
        return messageService.sendMessage();
    }
}
