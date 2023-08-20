package com.apiproject.test.apiproject.Service;

import com.apiproject.test.apiproject.Entity.userdetails;
import com.apiproject.test.apiproject.Repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public userdetails saveUserDetails(userdetails userEntity) {
        return userDetailsRepository.save(userEntity);
    }
}
