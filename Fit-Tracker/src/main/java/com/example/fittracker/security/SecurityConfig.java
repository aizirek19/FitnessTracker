//package com.example.fittracker.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable()) // Отключаем CSRF, если не требуется
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers(HttpMethod.GET,"/api/stats", "/api/activities").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers(HttpMethod.POST, "/api/activity", "/api/goal").hasAnyRole("USER")
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(httpBasic -> {}); // Настройка HTTP Basic с использованием нового API
//
//        return http.build();
//    }
//    @Bean
//    public JdbcUserDetailsManager jdbcUserDetailsManager() {
//        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
//        manager.setUsersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username = ?");
//        manager.setAuthoritiesByUsernameQuery("SELECT u.username, r.role FROM users u INNER JOIN user_roles r ON u.id = r.user_id WHERE u.username = ?");
//        return manager;
//    }
//}
