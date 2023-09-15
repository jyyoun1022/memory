package lab.jaeyeal.memory.work;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Date;

public class Jwt {
    package com.infiniq.dataops.base.helper;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Component;

import com.infiniq.dataops.base.type.ServiceType;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

    @Slf4j
    @Component
    public class JwtTokenHelper {
        private final int          ACCESS_EXPIRATION_TIME  = 7 * (24 * 60 * 60 * 1000);                                     // 7 days
        private final int          REFRESH_EXPIRATION_TIME = 7 * (24 * 60 * 60 * 1000);                                     // 7 days
        private byte[]             encryptKey              = DatatypeConverter.parseBase64Binary(ENCRYPT_STRING);
        private SignatureAlgorithm signatureAlgorithm      = SignatureAlgorithm.HS256;
        private final Key KEY                     = new SecretKeySpec(encryptKey, signatureAlgorithm.getJcaName());

        public String generateAccessToken(ServiceType service, String userId) {
            long curTime = System.currentTimeMillis();

            return Jwts.builder()
                    .setHeaderParam("typ", "JWT")
                    .setSubject(service.getCode())
                    .claim("id", userId)
                    .setExpiration(new Date(curTime + ACCESS_EXPIRATION_TIME))
                    .signWith(signatureAlgorithm, KEY)
                    .compact();
        }

        public String generateAccessToken(ServiceType service, String userId, String sessionId) {
            long curTime = System.currentTimeMillis();

            return Jwts.builder()
                    .setHeaderParam("typ", "JWT")
                    .setSubject(service.getCode())
                    .claim("id", userId)
                    .claim("sessionId", sessionId)
                    .setExpiration(new Date(curTime + ACCESS_EXPIRATION_TIME))
                    .signWith(signatureAlgorithm, KEY)
                    .compact();
        }

        public String generateRefreshToken(ServiceType service, String userId) {
            long curTime = System.currentTimeMillis();

            return Jwts.builder()
                    .setHeaderParam("typ", "JWT")
                    .setSubject(service.getCode())
                    .claim("id", userId)
                    .setExpiration(new Date(curTime + REFRESH_EXPIRATION_TIME))
                    .signWith(signatureAlgorithm, KEY)
                    .compact();
        }

        public String generateRefreshToken(ServiceType service, String userId, String sessionId) {
            long curTime = System.currentTimeMillis();

            return Jwts.builder()
                    .setHeaderParam("typ", "JWT")
                    .setSubject(service.getCode())
                    .claim("id", userId)
                    .claim("sessionId", sessionId)
                    .setExpiration(new Date(curTime + REFRESH_EXPIRATION_TIME))
                    .signWith(signatureAlgorithm, KEY)
                    .compact();
        }

        public String getAccessTokenByRefeshToken(String token) {
            return "";
        }

        public Boolean validationToken(String token) {
            try {
                Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);

                return true;
            } catch (JwtException ex) {
                log.warn("Check token Validation Fail : {}", ex.getMessage());
                return false;
            }
        }

        public ServiceType getServiceType(String token) {
            try {
                Jws<Claims> claims      = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);
                String      serviceType = claims.getBody().getSubject();

                return ServiceType.fromCode(serviceType);
            } catch (JwtException ex) {
                log.warn("Check token Validation Fail : {}", ex.getMessage());
                return null;
            }
        }

        public String getUserId(String token) {
            try {
                Jws<Claims> claims = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);

                return claims.getBody().get("id").toString();
            } catch (JwtException ex) {
                log.warn("Check token Validation Fail : {}", ex.getMessage());
                return null;
            }
        }

        public String getSessionId(String token) {
            try {
                Jws<Claims> claims = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);

                return claims.getBody().get("sessionId").toString();
            } catch (JwtException ex) {
                log.warn("Check token Validation Fail : {}", ex.getMessage());
                return null;
            }
        }
    }

}
