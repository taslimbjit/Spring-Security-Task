package com.taslim.springSecurityDemo.service;


import com.taslim.springSecurityDemo.model.UserRequestModel;
import com.taslim.springSecurityDemo.model.UserResponeModel;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UserService {
    ResponseEntity<Object> register(UserRequestModel requestModel);

    UserResponeModel getUser(Long id);
    List <UserResponeModel> getUsers();
}
