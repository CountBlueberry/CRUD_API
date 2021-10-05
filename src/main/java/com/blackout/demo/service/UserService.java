package com.blackout.demo.service;

import com.blackout.demo.entety.User;
import com.blackout.demo.entety.UserDto;
import com.blackout.demo.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    private void fillUserMap() {

    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setAge(userDto.getAge());
        userRepo.save(user);
    }

    public User getUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    public void updateUser(UserDto userDto, Long id) {
        User user = getUser(id);
        user.setName(userDto.getName());
        user.setAge(userDto.getAge());
        userRepo.save(user);
    }
}
