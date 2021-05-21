package com.config;

import com.Service.UserService;
import com.filters.JwtRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true, securedEnabled = true)
public class SecurityConfig  {
//
////    @Autowired
//    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
//
////    @Autowired
//    private JwtRequestFilter jwtRequestFilter;
//
////    @Autowired
//    private UserService userService;
//
////    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
////        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//    }
//
////    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
////    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception{
//        return super.authenticationManagerBean();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().
//                authorizeRequests().antMatchers("/auth","/api/register").permitAll().
//                anyRequest().authenticated().and().
//                exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement().
//                sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//        http.cors().and().csrf().disable();
//    }
}
