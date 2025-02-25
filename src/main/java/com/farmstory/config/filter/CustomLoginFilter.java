package com.farmstory.config.filter;

import com.farmstory.entity.user.UserEntity;
import com.farmstory.repository.user.UserRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class CustomLoginFilter implements AuthenticationSuccessHandler {

    private final UserRepository userRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
        AuthenticationSuccessHandler.super.onAuthenticationSuccess(request, response, chain, authentication);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        String username = authentication.getName();
        Optional<UserEntity> optUser = userRepository.findByUserId(username);

        if (optUser.isPresent() && "withdrawal".equals(optUser.get().getUserRole())) {
            response.sendRedirect("/error/withdrawal"); // "withdrawal" 역할인 경우 에러 페이지로 리다이렉트
        } else if(optUser.isPresent()&& "ban".equals(optUser.get().getUserRole())) {
          response.sendRedirect("/error/ban");
        } else {
            response.sendRedirect("/");  // 성공 시 기본적으로 홈 페이지로 리다이렉트
        }
    }
}
