package com.example.votingapp.User;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private  String lastName;
    private String password;
    private int userRoleId;
    private String userName;
    private String userEmail;
    private LocalDateTime dateOfBirth;
    private String userAddress;
    private int age;
}
