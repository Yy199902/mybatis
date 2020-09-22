package com.example.mybatis.service.impl;

import java.util.Arrays;

public enum  PendingType {

    PAYMENT('1'),
    CANCEL('2');

    private final char value;

    private PendingType(char value) {
        this.value = value;
    }

    public char value() {
        return this.value;
    }

    public static PendingType of(char value) {
        return Arrays.stream(PendingType.values())
                .filter(element -> element.value == value)
                .findFirst().orElse(null);
    }
}
