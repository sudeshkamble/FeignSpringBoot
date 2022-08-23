package com.javatechie.spring.feign.api;

import com.javatechie.spring.feign.api.client.UserClient;
import com.javatechie.spring.feign.api.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignRestController {

    @Autowired
    private UserClient userClient;



    @GetMapping("/findAllUser")
    public List<UserResponse> getAllUser() {
        return userClient.getUsers();
    }



}
