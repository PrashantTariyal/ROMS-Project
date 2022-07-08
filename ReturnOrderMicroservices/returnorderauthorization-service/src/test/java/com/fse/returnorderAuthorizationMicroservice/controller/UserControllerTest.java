package com.fse.returnorderAuthorizationMicroservice.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fse.returnorderAuthorizationMicroservice.entity.User;
import com.fse.returnorderAuthorizationMicroservice.service.UserService;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {UserController.class})
@ExtendWith(SpringExtension.class)
class UserControllerTest {
    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;


    /**
     * Method under test: {@link UserController#registerNewUser(User)}
     */
    @Test
    void testRegisterNewUser() throws Exception {
        User user = new User();
        user.setRole(new HashSet<>());
        user.setUserFirstName("atul");
        user.setUserLastName("manager");
        user.setUserName("atul");
        user.setUserPassword("atulmanager");
        when(this.userService.registerNewUser((User) any())).thenReturn(user);

        User user1 = new User();
        user1.setRole(new HashSet<>());
        user1.setUserFirstName("atul");
        user1.setUserLastName("manager");
        user1.setUserName("atul");
        user1.setUserPassword("atulmanager");
        String content = (new ObjectMapper()).writeValueAsString(user1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/registerNewUser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.userController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"userName\":\"atul\",\"userFirstName\":\"atul\",\"userLastName\":\"manager\",\"userPassword\":\"atulmanager\","
                                        + "\"role\":[]}"));
    }
}

