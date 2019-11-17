package com.mycompany.myapp.security.firebase.config;

import com.mycompany.myapp.security.jwt.JWTFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

public class FirebaseConfig {
    private Logger logger = LoggerFactory.getLogger(FirebaseConfig.class);


    @Bean
    public FirebaseConfig initFirebaseConfig() {
        return new FirebaseConfig();
    }

    @PostConstruct
    private void init() {
        logger.debug("Init goes here AAAAAAAAAAAAAAAAAAAAA");
    }
}
