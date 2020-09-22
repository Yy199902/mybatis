package com.example.mybatis.mapper;

import java.util.List;

import com.example.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WebTestMapper {
    List < User > select ( String id );

    List<User> selectAll (List< User> ids);

    String selectById(String id);

    String selectByName(String id);

    void del(String s);

    void add();

}
