package com.example.votingapp.Citizen;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CitizenMapper {
    private final PasswordEncoder passwordEncoder;
    public Citizen toCitizen(CitizenRequest citizenRequest){
        return Citizen.builder()
                .id(citizenRequest.getId())
                .citizenName(citizenRequest.getCitizenName())
                .citizenUsername(citizenRequest.getCitizenUsername())
                .citizenAddress(citizenRequest.getCitizenAddress())
                .citizenEmail(citizenRequest.getCitizenEmail())
                .mobileNumber(citizenRequest.getMobileNumber())
                .citizenPassword(passwordEncoder.encode(citizenRequest.getCitizenPassword()))
                .build();
    }
    public CitizenResponse toResponse(Citizen citizen){
        return CitizenResponse.builder()
                .id(citizen.getId())
                .citizenName(citizen.getCitizenName())
                .citizenUsername(citizen.getCitizenUsername())
                .citizenAddress(citizen.getCitizenAddress())
                .citizenEmail(citizen.getCitizenEmail())
                .build();
    }
}
