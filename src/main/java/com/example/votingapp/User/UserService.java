package com.example.votingapp.User;

import com.example.votingapp.Citizen.Citizen;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User register(RegisterRequest request);
       List<User> getUser();
       Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User user, String verificationToken);
}
