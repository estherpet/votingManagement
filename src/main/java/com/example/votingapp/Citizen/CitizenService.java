package com.example.votingapp.Citizen;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CitizenService {

    Citizen createCitizen(CitizenRequest citizen);

    CitizenResponse getCitizenById(Integer id);

    List<CitizenResponse> getAllCitizens();

    CitizenResponse updateCitizen(Integer id, CitizenRequest updatedCitizen);

    void deleteCitizen(Integer id);
}


