package com.taslim.springSecurityDemo.controllers;

import com.taslim.springSecurityDemo.model.UserRequestModel;
import com.taslim.springSecurityDemo.model.UserResponeModel;
import com.taslim.springSecurityDemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody UserRequestModel requestModel){

//        System.out.println(requestModel);
        return userService.register(requestModel);
    }
    @GetMapping("getuser/{id}")
    public UserResponeModel getUser(@PathVariable Long id){
        return userService.getUser(id);
    }
    @GetMapping("getusers")
    public List<UserResponeModel> getUsers(){
        return userService.getUsers();
    }

}