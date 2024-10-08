package com.ecommerce.plantme.controller;

import com.ecommerce.plantme.payloads.CartDTO;
import com.ecommerce.plantme.payloads.UserDTO;
import com.ecommerce.plantme.service.CartService;
import com.ecommerce.plantme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserDTO> getUser (@PathVariable Long userId) {
        UserDTO userDTO = userService.getUserbyId(userId);
        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.CREATED);
    }
}
