package com.tech.vihanga.employeemanagementjwt.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000;//5 days in miliseconsds
    public static final String TOKEN_HEADER = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token Cannot Be Verified";
    public static final String ARCH_TECH = "ARCH_TECH";
    public static final String ARCH_TECH_ADMINS = "USER Management Portal";
    public static final String AUTHORITIES = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "You Need to LOg in to Acess this Page";
    public static final String ACCESS_DENIED_MESSAGE = "YOU DONT HAVE PERMISSION TO ACCESS THIS PAGE";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/rest/password/**", "/user/image/**"};
}
