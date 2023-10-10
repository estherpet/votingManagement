package com.example.votingapp.User;

import com.example.votingapp.event.RegistrationCompleteEvent;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterationController {

    private  final ApplicationEventPublisher publisher;
    private  final UserService userService;
    @PostMapping("/register")
    public String registerUser(RegisterRequest request, final HttpServletRequest servletRequest){
        User user = userService.register(request);
        publisher.publishEvent(new RegistrationCompleteEvent(user,applicationUrl(servletRequest)));
        return "Success! Please, check your email to confirm your account";
    }
    public String applicationUrl(HttpServletRequest request){
       return "http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    }
}
