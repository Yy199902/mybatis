package com.example.mybatis.service.impl;

import com.example.mybatis.service.Test2;
import org.springframework.stereotype.Service;

@Service
public class Test2Impl implements Test2 {

    @Override
    public String test2() {
        System.out.println("222");
        return null;
    }
}
