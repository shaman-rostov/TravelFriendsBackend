package eu.shinkarenko.travelfriendsbackend.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.crypto.SecretKey;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Date;

public class TokenAuthenticationService {

    static final long EXPIRATIONTIME = 864_000_000; // 10 days

    static final String SECRET = "1234567890123456789012345678901234567890123456789012345678901234";

    static final String TOKEN_PREFIX = "Bearer";

    static final String HEADER_STRING = "Authorization";
    static final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    static final String base64Key = Encoders.BASE64.encode(key.getEncoded());
    public static void addAuthentication(HttpServletResponse res, String username) {

        System.out.println("key: "+key.toString());
        String JWT = Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                        .signWith(key).compact();
               // .signWith(SignatureAlgorithm.HS512, base64Key).compact();
        res.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
        System.out.println("JWT: "+JWT);
    }

    public static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);
        System.out.println("token: "+token);
        if (token != null) {
            // parse the token.
            String user = Jwts.parser().setSigningKey(base64Key).parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody()
                    .getSubject();



            return user != null ? new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList()) : null;
        }
        return null;
    }

}
