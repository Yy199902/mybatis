package com.example.mybatis.entity;

import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.concurrent.CompletableFuture;


public class  User implements Serializable {
        private String id;
        private String name;
        private CompletableFuture<User> future;


        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public CompletableFuture<User> getFuture() {
                return future;
        }

        public void setFuture(CompletableFuture<User> future) {
                this.future = future;
        }


}
