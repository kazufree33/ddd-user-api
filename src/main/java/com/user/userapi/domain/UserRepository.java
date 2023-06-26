package com.user.userapi.domain;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findByEmail(@Param("email") Email email);

}
