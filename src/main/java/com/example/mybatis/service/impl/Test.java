package com.example.mybatis.service.impl;

import com.example.mybatis.entity.User;
import javafx.util.Pair;
import sun.nio.ch.DirectBuffer;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ThreadLocal<User> objectThreadLocal = new ThreadLocal<User>(){
            @Override
            protected User initialValue(){
                return new User();
            }

        };
        User user = objectThreadLocal.get();

        System.out.println(user.getFuture());
    }

}

