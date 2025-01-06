package com.fiveman.newsfeed.controller;

import com.fiveman.newsfeed.dto.UserRequestDto;
import com.fiveman.newsfeed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 사용자 관련 메서드 제거
    // @PostMapping("/users")
    // public User createUser(@RequestBody UserRequestDto userRequestDto) {
    //     return userService.createUser(userRequestDto);
    // }
}