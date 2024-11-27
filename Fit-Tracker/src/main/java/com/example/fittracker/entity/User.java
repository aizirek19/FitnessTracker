//package com.example.fittracker.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Data
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long id;
//
//    private String username;
//
//    private String password;
//
//    private boolean enabled;
//
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private Set<UserRole> roles = new HashSet<>();
//}
//
//
