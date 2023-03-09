package com.SGSJ.JavaspringCRUD.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AuthenticationConfig {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new SecurityUserDetailService();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/", "/user/register").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginProcessingUrl("/user/login").permitAll()
                    .usernameParameter("email")
                    .failureUrl("/user/login")
                    .and()
                    .logout().permitAll()
                    .and()
                .httpBasic();
        return http.build();
    }
}
