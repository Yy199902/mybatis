package com.example.mybatis.service.impl;

import com.example.mybatis.service.Test1;
import com.example.mybatis.service.Test2;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements Test1 {

    @Autowired
    private Test2 test2;

    @Override
    public String test() {
        System.out.println("1111");
        test2.test2();
        return null;
    }
}
