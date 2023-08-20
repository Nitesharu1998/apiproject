package com.apiproject.test.apiproject.Repository;

import com.apiproject.test.apiproject.Entity.userdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<userdetails, Integer> {// TODO to perform CRUD operations on DB
}
