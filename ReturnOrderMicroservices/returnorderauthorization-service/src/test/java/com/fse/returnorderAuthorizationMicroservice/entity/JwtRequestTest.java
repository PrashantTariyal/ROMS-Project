package com.fse.returnorderAuthorizationMicroservice.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JwtRequestTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link JwtRequest}
     *   <li>{@link JwtRequest#setUserName(String)}
     *   <li>{@link JwtRequest#setUserPassword(String)}
     *   <li>{@link JwtRequest#getUserName()}
     *   <li>{@link JwtRequest#getUserPassword()}
     * </ul>
     */
    @Test
    void testConstructor() {
        JwtRequest actualJwtRequest = new JwtRequest();
        actualJwtRequest.setUserName("atul");
        actualJwtRequest.setUserPassword("atulmanager");
        assertEquals("atul", actualJwtRequest.getUserName());
        assertEquals("atulmanager", actualJwtRequest.getUserPassword());
    }
}

