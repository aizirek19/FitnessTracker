//package com.example.fittracker.controller;
//
//import com.example.fittracker.entity.User;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest request) {
//        try {
//            User newUser = userService.registerUser(request.getUsername(), request.getPassword());
//            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
//        }
//    }
//
//    public static class RegisterRequest {
//        private String username;
//        private String password;
//
//        public String getPassword() {
//            return password;
//        }
//
//        public String getUsername() {
//            return username;
//        }
//    }
//}
