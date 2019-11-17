package com.mycompany.myapp.security.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FirebaseParser {
    private Logger logger = LoggerFactory.getLogger(FirebaseParser.class);
	public FirebaseTokenHolder parseToken(String idToken) {
		if (StringUtils.isBlank(idToken)) {
			throw new IllegalArgumentException("FirebaseTokenBlank");
		}
		try {
			FirebaseToken authTask = FirebaseAuth.getInstance().verifyIdToken(idToken);
			return new FirebaseTokenHolder(authTask);
		} catch (Exception e) {
		    logger.error(e.getMessage());
			return null;
		}
	}
}
