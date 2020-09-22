package com.example.mybatis.service.impl;

import com.example.mybatis.enums.CrudType;
import com.example.mybatis.service.DaoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JpaServiceImpl implements DaoService {
    @Override
    public String getCrudType() {
        return CrudType.JPA.getType();
    }

    @Override
    @Transactional
    public String curd() {
        StringBuffer sql =new StringBuffer();
        System.out.println("jpa");

        return null;
    }
}
