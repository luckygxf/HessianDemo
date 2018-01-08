package com.gxf.server.impl;

import com.gxf.model.User;
import com.gxf.service.IService;

/**
 * Created by 58 on 2018/1/8.
 */
public class ServiceImpl implements IService {


    public User getUser() {
        System.out.println("Recevie request");
        return new User("guanxiangseneg", 28);
    }
}
