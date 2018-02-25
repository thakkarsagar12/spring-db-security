package com.prudenttech.security.securitydbexample.repository;

import com.prudenttech.security.securitydbexample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
