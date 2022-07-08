package com.fse.returnorderAuthorizationMicroservice.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fse.returnorderAuthorizationMicroservice.dao.RoleDao;
import com.fse.returnorderAuthorizationMicroservice.entity.Role;

@ContextConfiguration(classes = {RoleService.class})
@ExtendWith(SpringExtension.class)
class RoleServiceTest {
    @MockBean
    private RoleDao roleDao;

    @Autowired
    private RoleService roleService;

    /**
     * Method under test: {@link RoleService#createNewRole(Role)}
     */
    @Test
    void testCreateNewRole() {
        Role role = new Role();
        role.setRoleDescription("Role Description");
        role.setRoleName("Role Name");
        when(this.roleDao.save((Role) any())).thenReturn(role);

        Role role1 = new Role();
        role1.setRoleDescription("Role Description");
        role1.setRoleName("Role Name");
        assertSame(role, this.roleService.createNewRole(role1));
        verify(this.roleDao).save((Role) any());
    }
}

