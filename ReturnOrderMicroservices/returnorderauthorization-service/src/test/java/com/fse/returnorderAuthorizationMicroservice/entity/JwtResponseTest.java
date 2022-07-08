package com.fse.returnorderAuthorizationMicroservice.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class JwtResponseTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link JwtResponse#JwtResponse(User, String)}
     *   <li>{@link JwtResponse#setJwtToken(String)}
     *   <li>{@link JwtResponse#setUser(User)}
     *   <li>{@link JwtResponse#getJwtToken()}
     *   <li>{@link JwtResponse#getUser()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User user = new User();
        user.setRole(new HashSet<>());
        user.setUserFirstName("atul");
        user.setUserLastName("manager");
        user.setUserName("atul");
        user.setUserPassword("atulmanager");
        JwtResponse actualJwtResponse = new JwtResponse(user, "ABC123");
        actualJwtResponse.setJwtToken("ABC123");
        User user1 = new User();
        user1.setRole(new HashSet<>());
        user1.setUserFirstName("atul");
        user1.setUserLastName("manager");
        user1.setUserName("atul");
        user1.setUserPassword("atulmanager");
        actualJwtResponse.setUser(user1);
        assertEquals("ABC123", actualJwtResponse.getJwtToken());
        assertSame(user1, actualJwtResponse.getUser());
    }
}

