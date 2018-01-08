package com.gxf.server.impl;

import com.gxf.model.User;
import com.gxf.service.IService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by 58 on 2018/1/8.
 */
public class ServiceImpl implements IService {
    private static Logger logger = LogManager.getLogger(ServiceImpl.class);

    public User getUser() {
        logger.info("Receive reqeust");
        System.out.println("Recevie request");
        return new User("guanxiangseneg", 28);
    }
}
