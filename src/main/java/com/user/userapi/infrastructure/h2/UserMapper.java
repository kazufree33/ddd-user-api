package com.user.userapi.infrastructure.h2;

import com.user.userapi.domain.Email;
import com.user.userapi.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {
    User findByEmail(@Param("email")Email email);
}
