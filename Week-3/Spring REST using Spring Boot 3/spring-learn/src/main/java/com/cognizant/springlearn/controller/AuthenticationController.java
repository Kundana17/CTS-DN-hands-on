package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("START");

        LOGGER.debug("Authorization Header : {}", authHeader);

        Map<String, String> map = new HashMap<>();

        String user = getUser(authHeader);

        String token = generateJwt(user);

        map.put("token", token);

        LOGGER.info("END");

        return map;
    }

    private String getUser(String authHeader) {

        String encodedCredentials = authHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials = new String(decodedBytes);

        LOGGER.debug(credentials);

        return credentials.substring(0, credentials.indexOf(":"));
    }

    private String generateJwt(String user) {

        JwtBuilder builder = Jwts.builder();

        builder.setSubject(user);

        builder.setIssuedAt(new Date());

        builder.setExpiration(
                new Date(System.currentTimeMillis() + 86400000)
        );

        builder.signWith(
                SignatureAlgorithm.HS256,
                "secretkey"
        );

        return builder.compact();
    }
}