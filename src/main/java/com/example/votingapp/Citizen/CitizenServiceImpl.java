package com.example.votingapp.Citizen;

import com.example.votingapp.validator.ObjectValidator;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {
    private final CitizenRepository citizenRepository;
    private final CitizenMapper mapper;
    @Autowired
    private ObjectValidator<CitizenRequest> validator;

    @Override
    public Citizen createCitizen(CitizenRequest request) {
        validator.validate(request);
        var citizen = mapper.toCitizen(request);
        return citizenRepository.save(citizen);
    }

    @Override
    public CitizenResponse getCitizenById(Integer id) {
        return citizenRepository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("No user found with id::" + id));
    }

    @Override
    public List<CitizenResponse> getAllCitizens() {
        return citizenRepository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public CitizenResponse updateCitizen(Integer id, CitizenRequest updatedCitizen) {
        return citizenRepository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("No user found with id::" + id));
//        if (citizenRepository.existsById(id)) {
//            Citizen existingCitizen = citizenRepository.getOne(id);
//
//            existingCitizen.setCitizenUsername(updatedCitizen.getCitizenUsername());
//            existingCitizen.setCitizenAddress(updatedCitizen.getCitizenAddress());
//
//            return citizenRepository.save(existingCitizen);
//        }
    }

    @Override
    public void deleteCitizen(Integer id) {
        citizenRepository.deleteById(id);
    }
}
