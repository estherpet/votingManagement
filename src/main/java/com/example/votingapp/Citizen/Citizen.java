package com.example.votingapp.Citizen;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "citizen")
@Builder
@Entity
public class
Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String citizenName;
    private String citizenPassword;
    private String citizenAddress;
    private String citizenEmail;
    private String mobileNumber;
    private  String citizenUsername;
}



























