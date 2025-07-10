package com.example.jwt_handson.controller;

import com.example.jwt_handson.dto.AuthRequest;
import com.example.jwt_handson.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest request) {

        // Debug logs – these print in your terminal
        System.out.println("Received username: " + request.getUsername());
        System.out.println("Received password: " + request.getPassword());

        // Check for correct credentials (hardcoded)
        if ("user".equals(request.getUsername()) && "pass".equals(request.getPassword())) {
            String token = jwtService.generateToken(request.getUsername());
            return ResponseEntity.ok(token); // ✅ Success: return JWT
        } else {
            return ResponseEntity.status(401).body("Invalid credentials"); // ❌ Failure
        }
    }
}
