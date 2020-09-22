package com.example.mybatis.enums;

import java.util.Arrays;

public enum  CrudType {
    JDBC("jdbc"),
    JPA("jpa"),
    MYBATIS("mybatis"),
    HIBERNATE("hibernate");
    private String type;


    CrudType(String type) {
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public static CrudType of(String value){
        return Arrays.stream(CrudType.values()).filter(element -> element.type.equals(value)).findFirst().orElse(null);
    }

}
