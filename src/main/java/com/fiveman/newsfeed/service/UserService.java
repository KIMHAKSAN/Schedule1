package com.fiveman.newsfeed.service;

import com.fiveman.newsfeed.domain.User;
import com.fiveman.newsfeed.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // findUserById 메서드 추가
    public User findUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new IllegalArgumentException("User not found with id: " + userId); // 사용자 찾지 못했을 때 예외 처리
        }
    }

    // 기존의 createUser 메서드 등
    // ...
}