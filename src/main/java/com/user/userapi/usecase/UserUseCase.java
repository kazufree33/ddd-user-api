package com.user.userapi.usecase;

import com.user.userapi.domain.Email;
import com.user.userapi.domain.User;
import com.user.userapi.domain.UserRepository;
import com.user.userapi.presentation.UserOutputDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserUseCase {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public UserOutputDTO findByEmail(Email email){
        User user = userRepository.findByEmail(email);
        return new UserOutputDTO(user);
    }
}
