package com.example.votingapp.Citizen;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitizenRequest {
    private  int id;
    private String citizenName;
    private String citizenPassword;
    private String citizenAddress;
    private String citizenEmail;
    private String mobileNumber;
    private  String citizenUsername;
}
