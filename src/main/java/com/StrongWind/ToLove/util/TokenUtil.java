package com.StrongWind.ToLove.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.security.Key;

public class TokenUtil {
    private static   final String secret = "houyimingdasdhadadadhadhasdhahdahsdnasbcbcbcxbzxxz221231231dia12";
    public static String generateToken(Map<String, Object> aClaimsMap) {
        Key KEY =  new SecretKeySpec(secret.getBytes(),SignatureAlgorithm.HS256.getJcaName());
        Map<String,Object>tHeaderMap = new HashMap<String,Object>();
        String tToken = Jwts.builder()
                .setHeader(tHeaderMap)
                .setClaims(aClaimsMap)
                .signWith(KEY)
                .compact();
        System.out.println(tToken);
        return tToken;
    }
}
