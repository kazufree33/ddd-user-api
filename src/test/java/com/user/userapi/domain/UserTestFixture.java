package com.user.userapi.domain;

public class UserTestFixture {

    public static User UserA(){
        User user = new User();
        user.setEmail(new Email("test@example.com"));
        user.setName(new Name("Sample Taro"));
        return user;
    }
}
