package com.saferent.security.jwt;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JwtUtils {
    private static final Logger loggger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${saferent.app.jwtSecret}")
    private String jwtSecret;
}
