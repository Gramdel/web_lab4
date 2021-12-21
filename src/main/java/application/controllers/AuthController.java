package application.controllers;

import application.dto.AuthRequest;
import application.entities.User;
import application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value="/login",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    private ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        System.out.println(authRequest.getUsername()+"\n"+authRequest.getPassword());
        User user = userRepository.getUserByUsername(authRequest.getUsername());
        if (user == null) {
            return new ResponseEntity<>("0:There is no user with such username!", HttpStatus.NOT_FOUND);
        } else if (!user.getPassword().equals(authRequest.getPassword())) {
            return new ResponseEntity<>("1:Wrong password!", HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok("");
        }
    }


    @PostMapping("/register")
    public String register(@RequestBody AuthRequest authRequest) {
        System.out.println("it works!");
        System.out.println(authRequest.getUsername()+"\n"+authRequest.getPassword());
        return "register";
    }
}
