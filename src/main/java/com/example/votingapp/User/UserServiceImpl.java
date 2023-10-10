package com.example.votingapp.User;

import com.example.votingapp.Token.VerificationToken;
import com.example.votingapp.Token.VerificationTokenRepository;
import com.example.votingapp.validator.ObjectValidator;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private  final UserMapper mapper;
    private final ObjectValidator<RegisterRequest> validator;
    private final UserRepository userRepository;

private  final VerificationTokenRepository verificationTokenRepository;
    @Override
    public User register(RegisterRequest request) {
       validator.validate(request);
       var newUser = mapper.toUser(request);
        return userRepository.save(newUser);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUserVerificationToken(User user, String token) {
        var verificationToken = new VerificationToken(token,user);
        verificationTokenRepository.save(verificationToken);
    }
}

