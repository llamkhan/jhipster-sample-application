package com.mycompany.myapp.security.firebase.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.mycompany.myapp.FirebaseRestDemoV1App;
import com.mycompany.myapp.security.jwt.JWTFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

public class FirebaseConfig {
    @PostConstruct
    private void init() throws IOException {
        InputStream privateKey = FirebaseRestDemoV1App.class
            .getClassLoader().getResourceAsStream("key/moonlit-haven-250615-firebase-adminsdk-pbu7m-5ed5832619.json");
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(privateKey))
            .build();
//  Store the secret on server env and let resolve is more secure and is strongly recommended.
//        FirebaseOptions options = new FirebaseOptions.Builder()
//            .setCredentials(GoogleCredentials.getApplicationDefault())
//            .build();
        FirebaseApp.initializeApp(options);
    }
}
