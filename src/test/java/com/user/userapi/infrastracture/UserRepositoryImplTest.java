package com.user.userapi.infrastracture;

import com.user.userapi.domain.Email;
import com.user.userapi.domain.User;
import com.user.userapi.domain.UserTestFixture;
import com.user.userapi.infrastructure.h2.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;



@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryImplTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findByEmail(){
        User user = userMapper.findByEmail(new Email("test@example.com"));
        Assertions.assertEquals(user, UserTestFixture.UserA());
    };
}
