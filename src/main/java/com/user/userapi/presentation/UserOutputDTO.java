package com.user.userapi.presentation;

import com.user.userapi.domain.User;
import lombok.Value;

@Value
public class UserOutputDTO {

    private String email;
    private String name;
    public UserOutputDTO(User user){
        this.email = user.getEmail().getEmail();
        this.name = user.getName().getName();
    }
}
