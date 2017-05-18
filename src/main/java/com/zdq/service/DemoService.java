package com.zdq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by zhoudeqiang on 2017/5/18.
 */
@Service
public class DemoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String say(String name){

        logger.info("{} say hello",name);

        return name+" hello";
    }
}
