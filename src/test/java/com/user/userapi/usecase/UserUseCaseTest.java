package com.user.userapi.usecase;

import com.user.userapi.domain.User;
import com.user.userapi.domain.UserRepository;
import com.user.userapi.domain.UserTestFixture;
import com.user.userapi.presentation.UserOutputDTO;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UserUseCaseTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserUseCase useCase;

    @Test
    public void test() {
        String email = "test@example.com";
        String name = "Sample Taro";
        when(userRepository.findByEmail(email)).thenReturn(UserTestFixture.UserA());

        // execution Test
        UserOutputDTO result = useCase.findByEmail(email);
        verify(userRepository, times(1)).findByEmail(email);
        assertEquals(email, result.getEmail());
        assertEquals(name, result.getName());

    }

}
