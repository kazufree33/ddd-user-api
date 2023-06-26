package com.user.userapi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void test() {
        Assertions.assertEquals("test@example.com", UserTestFixture.UserA().getEmail().getEmail());
    }
}
