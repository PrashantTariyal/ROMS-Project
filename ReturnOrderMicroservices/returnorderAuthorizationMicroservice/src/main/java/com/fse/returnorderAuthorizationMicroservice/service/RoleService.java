package com.fse.returnorderAuthorizationMicroservice.service;

import com.fse.returnorderAuthorizationMicroservice.dao.RoleDao;
import com.fse.returnorderAuthorizationMicroservice.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
