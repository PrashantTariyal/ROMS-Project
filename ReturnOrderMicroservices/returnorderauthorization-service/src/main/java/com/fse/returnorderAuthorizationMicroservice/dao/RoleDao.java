package com.fse.returnorderAuthorizationMicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.returnorderAuthorizationMicroservice.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
