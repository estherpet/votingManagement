package com.example.votingapp.User;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@Builder
public class RegisterRequest {
    private String username;
    private String firstName;
    private  String lastName;
    private String password;
    private String email;
    private LocalDateTime dateOfBirth;
    private int age;


}
