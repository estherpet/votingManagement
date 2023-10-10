package com.example.votingapp.Candidate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidateServiceImpl implements  CandidateService{
    private  final CanditateRepository canditateRepository;
    public CandidateServiceImpl(CanditateRepository canditateRepository) {
        this.canditateRepository = canditateRepository;
    }
    @Override
    public List<Candidate> getAllCandidates() {
        return canditateRepository.findAll();
    }
    @Override
    public Candidate getCandidateById(Long id) {
        return canditateRepository.findById(id).orElse(null);
    }
    @Override
    public Candidate createCandidate(Candidate candidate) {
        return canditateRepository.save(candidate);
    }
    @Override
    public Candidate updateCandidate(Long id, Candidate candidate) {
        Candidate existingCandidate = canditateRepository.findById(id).orElse(null);
        if (existingCandidate != null) {
            existingCandidate.setCandidateUserName(candidate.getCandidateUserName());
            existingCandidate.setParty(candidate.getParty());
            return canditateRepository.save(existingCandidate);
        }
        return null;
    }
    @Override
    public void deleteCandidate(Long id) {
        canditateRepository.deleteById(id);
    }
}


