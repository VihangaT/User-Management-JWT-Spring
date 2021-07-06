package com.tech.vihanga.employeemanagementjwt.filter;

import com.tech.vihanga.employeemanagementjwt.utility.JWTTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.tech.vihanga.employeemanagementjwt.constant.SecurityConstant.OPTIONS_HTTP_METHOD;
import static com.tech.vihanga.employeemanagementjwt.constant.SecurityConstant.TOKEN_HEADER;

public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Autowired
    private JWTTokenProvider jwtTokenProvider;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        if (request.getMethod().equalsIgnoreCase(OPTIONS_HTTP_METHOD)) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
        } else {
            String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if (authorizationHeader == null || authorizationHeader.startsWith(TOKEN_HEADER)) {
                filterChain.doFilter(request, httpServletResponse);
            }
        }
    }
}
