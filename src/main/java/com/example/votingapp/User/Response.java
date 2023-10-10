package com.example.votingapp.User;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder

public class Response {

    private String username;
    private  String lastName;
    private String firstName;
    private String email;

}
