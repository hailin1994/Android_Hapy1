package com.yhl.learn.spring.iocdemo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: learn
 * @description: spring 工厂类
 * @author: Yhl
 * @create: 2019-05-23 13:44
 **/
@Data
public class BeanFactory {
    private List<BeanDefinition> beanDefinitionList;
    private Map<String, Object> springIoc;

    public Object getBean(String beanId) throws Exception {
        for (BeanDefinition definition : beanDefinitionList) {

            if (beanId.equals(definition.getBeanId())) {
                if("single".equals(definition.getScop())){
                    return springIoc.get(definition.getBeanId());
                }
                else if("prototype".equals(definition.getScop())) {
                    Class classFile = Class.forName(definition.getClassPath());
                    return classFile.newInstance();
                }
            }
        }
        return null;
    }

    public BeanFactory(List<BeanDefinition> beanDefinitionList) throws Exception {
        springIoc = new HashMap<>();
        for (BeanDefinition definition : beanDefinitionList) {
            if ("single".equals(definition.getScop())) {
                Class classFile = Class.forName(definition.getClassPath());
                springIoc.put(definition.getBeanId(), classFile.newInstance());
            }
        }
    }
}
