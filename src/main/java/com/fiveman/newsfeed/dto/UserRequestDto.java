package com.fiveman.newsfeed.dto;

public class UserRequestDto {
    private Long userId;
    private String email;
    private String password;
    private Integer age;

    // 생성자 (필요한 경우)
    public UserRequestDto(Long userId, String email, String password, Integer age) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    // getter 메서드들 추가
    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }
}