package com.user.userapi.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {

    @Select("select * from users limit 1")
    User findByEmail(String email);

}
