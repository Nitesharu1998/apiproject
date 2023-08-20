package com.apiproject.test.apiproject.Controller;

import com.apiproject.test.apiproject.Entity.userdetails;
import com.apiproject.test.apiproject.Service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
    @Autowired
    UserDetailsService service;

    @PostMapping("/saveUser")
    public userdetails saveUserDetails(@RequestBody userdetails userDetails){
        return service.saveUserDetails(userDetails);
    }
}
