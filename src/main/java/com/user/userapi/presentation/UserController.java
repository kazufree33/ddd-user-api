package com.user.userapi.presentation;
;
import com.user.userapi.model.UserResponse;
import com.user.userapi.usecase.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    @Autowired
    private final UserUseCase userUseCase;

    @Override
    public ResponseEntity<UserResponse> getUser() {
        String email = "test@example.com";
        UserOutputDTO userOutputDTO = userUseCase.findByEmail(email);
        return ResponseEntity.ok(new UserResponse().email(userOutputDTO.getEmail())
                .name(userOutputDTO.getName()));
    }
}
