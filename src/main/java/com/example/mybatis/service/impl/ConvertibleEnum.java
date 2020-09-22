package com.example.mybatis.service.impl;

public interface ConvertibleEnum<T>  {


    T value();

    /**
     * Convert value to Enum.
     *
     * @param <E>
     * @param <T>
     * @param clazz
     * @param value
     * @return
     */
    static <E extends Enum<E> & ConvertibleEnum, T> E of(Class<E> clazz, T value) {

        return of(clazz, value, null);
    }

    /**
     * Convert value to Enum.
     *
     * @param <E>
     * @param <T>
     * @param clazz
     * @param value
     * @param defaultValue
     * @return
     */
    static <E extends Enum<E> & ConvertibleEnum, T> E of(Class<E> clazz, T value, E defaultValue) {

//        return EnumUtils.getEnumList(clazz).stream()
//                .filter(e -> Objects.equals(value, ((ConvertibleEnum) e).value()))
//                .findFirst()
//                .orElseGet(() -> defaultValue);R
        return null;
    }
}
