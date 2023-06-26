package com.user.userapi.infrastructure.h2;

import com.user.userapi.domain.Email;
import com.user.userapi.domain.User;
import com.user.userapi.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@Mapper
public class UserRepositoryImpl implements UserRepository {

    private final UserMapper userMapper;
    @Override
    public User findByEmail(Email email) {
        return this.userMapper.findByEmail(email);
    }
}
