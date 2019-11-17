package com.mycompany.myapp.security.firebase;

import com.mycompany.myapp.security.jwt.JWTFilter;
import com.mycompany.myapp.security.jwt.TokenProvider;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class FireBaseConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        FirebaseFilter customFilter = new FirebaseFilter();
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
