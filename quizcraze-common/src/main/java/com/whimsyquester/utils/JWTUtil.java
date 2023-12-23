package com.whimsyquester.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.whimsyquester.entity.config.AppConfig;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component("jwtUtil")

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: JWTUtil
 * @Datetime: 2023/11/19 23:35
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个JWT（JSON Web Token）的工具类JWTUtil。JWT是一种用于双方之间传递安全信息的简洁、自包含的方式。在这个工具类中，主要实现了JWT的生成和验证功能
 */


public class JWTUtil<T> {

    @Resource
    private AppConfig appConfig;

    public static void main(String[] args) throws Exception {
        String TOKEN_SECRET = "1245";
        String TOKEN_KEY = "key";
        String token = JWT.create().withClaim(TOKEN_KEY, "test").withExpiresAt(new Date(System.currentTimeMillis() + 10000)).sign(Algorithm.HMAC256(TOKEN_SECRET));
        System.out.println(token);
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).build();
        DecodedJWT jwt = verifier.verify(token);
        String jsonData = jwt.getClaim(TOKEN_KEY).asString();
        System.out.println(jsonData);
    }

    /**
     * @param key
     * @param data
     * @param expireDay
     * @return String
     * @description 生成JWT签名并返回生成的token
     */
    public String createToken(String key, T data, Integer expireDay) {
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + expireDay * 24 * 60 * 60 * 1000);
            token = JWT.create().withClaim(key, JsonUtils.convertObj2Json(data)).withExpiresAt(expiresAt).sign(Algorithm.HMAC256(appConfig.getJwtCommonSecret()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * @param key
     * @param token
     * @param classz
     * @return T
     * @description 验证和解析JWT
     */
    public <T> T getTokenData(String key, String token, Class<T> classz) {
        try {
            if (StringTools.isEmpty(token)) {
                return null;
            }
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(appConfig.getJwtCommonSecret())).build();
            DecodedJWT jwt = verifier.verify(token);
            String jsonData = jwt.getClaim(key).asString();
            return JsonUtils.convertJson2Obj(jsonData, classz);
        } catch (Exception e) {
            return null;
        }
    }
}

