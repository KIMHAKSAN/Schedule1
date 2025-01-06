package com.fiveman.newsfeed.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long userId;
    private String email;
    private String password;
    private Integer age;
    private Boolean isDeleted;

    // 기본 생성자 추가
    public User() {
    }

    // 필드를 받는 생성자 추가
    public User(Long userId, String email, String password, Integer age, Boolean isDeleted) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.age = age;
        this.isDeleted = isDeleted;
    }

    // Getters, Setters
}