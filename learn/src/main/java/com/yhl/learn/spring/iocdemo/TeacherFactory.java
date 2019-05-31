package com.yhl.learn.spring.iocdemo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @program: learn
 * @description: 自定义Teacher工厂
 * @author: Yhl
 * @create: 2019-05-23 14:39
 **/
@Data
@Slf4j

public class TeacherFactory {
    private Teacher teacher;
    public Teacher creatTeacher() {
        log.info("spring 自定义工厂创建teacher");
        return new Teacher();
    }
}
