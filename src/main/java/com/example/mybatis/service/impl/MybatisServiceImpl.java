package com.example.mybatis.service.impl;

import com.example.mybatis.entity.User;
import com.example.mybatis.enums.CrudType;
import com.example.mybatis.service.DaoService;
import org.springframework.stereotype.Service;

@Service
public class MybatisServiceImpl extends User implements DaoService  {
    @Override
    public String getCrudType() {
        return CrudType.MYBATIS.getType();
    }

    @Override
    public String curd() {
        System.out.println("mybatis");
        return null;
    }
}
