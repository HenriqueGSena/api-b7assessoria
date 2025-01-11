package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.config.TokenService;
import com.crud.b7assessoria.dto.AuthenticationDTO;
import com.crud.b7assessoria.dto.LoginDTO;
import com.crud.b7assessoria.dto.RegisterDTO;
import com.crud.b7assessoria.dto.UsersDTO;
import com.crud.b7assessoria.entities.Users;
import com.crud.b7assessoria.repository.UsersRepository;
import com.crud.b7assessoria.service.UsersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UsersController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersService usersService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    private ResponseEntity login(@RequestBody @Valid AuthenticationDTO authenticationDTO) {
        var UsernamePassword = new UsernamePasswordAuthenticationToken(authenticationDTO.name(), authenticationDTO.password());
        var auth = this.authenticationManager.authenticate(UsernamePassword);
        var token = tokenService.generateToken((Users) auth.getPrincipal());
        return ResponseEntity.ok(new LoginDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterDTO registerDTO) {
        if (this.usersRepository.findByName(registerDTO.name()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("User with this name already exists");
        }
        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.password());
        Users user = new Users(registerDTO.name(), encryptedPassword, registerDTO.role());
        this.usersRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
