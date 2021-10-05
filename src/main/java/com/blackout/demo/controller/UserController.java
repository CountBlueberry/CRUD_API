package com.blackout.demo.controller;

import com.blackout.demo.entety.User;
import com.blackout.demo.entety.UserDto;
import com.blackout.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
        userService.updateUser(userDto, id);
    }

    @GetMapping("/findAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
