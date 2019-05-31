package com.yhl.learn.spring.serviceImp;

import com.yhl.learn.spring.service.MessageService;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: learn
 * @description: 消息实现类
 * @author: Yhl
 * @create: 2019-05-22 19:16
 **/

@Slf4j
public class MessageServiceImpl implements MessageService {

    public String getMessage() {
        log.info("hello world");
        return "hello world";
    }
}