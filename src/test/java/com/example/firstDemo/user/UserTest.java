package com.example.firstDemo.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void getActualStatus() {
        var user = new User();
        assertEquals("Active", user.getActualStatus());
    }
}