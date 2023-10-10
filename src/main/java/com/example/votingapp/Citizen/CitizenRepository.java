package com.example.votingapp.Citizen;

import com.example.votingapp.Citizen.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
}
