package com.example.votingapp.Citizen;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitizenResponse {
    private  int id;
    private String citizenName;
    private String citizenAddress;
    private String citizenEmail;
    private  String citizenUsername;
}
