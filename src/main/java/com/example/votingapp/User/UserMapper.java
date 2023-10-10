package com.example.votingapp.User;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
private final PasswordEncoder passwordEncoder;
    public User toUser (RegisterRequest request){
        return User.builder().
                userName(request.getUsername())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .password(passwordEncoder.encode(request.getPassword()))
                .userEmail(request.getEmail())
                .dateOfBirth(request.getDateOfBirth())
                .age(request.getAge())
                .build();

    }
    public Response toResponse(User user){
        return Response.builder().
                username(user.getUserName())
                .lastName(user.getLastName())
                .firstName(user.getFirstName())
                .email(user.getUserEmail())
                .build();
    }
}
