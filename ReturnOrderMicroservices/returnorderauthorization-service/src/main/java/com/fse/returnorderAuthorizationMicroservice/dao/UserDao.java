package com.fse.returnorderAuthorizationMicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.returnorderAuthorizationMicroservice.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
}
