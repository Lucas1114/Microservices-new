//package com.programming.techie.discoveryserver.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig_springcloud2022_0_4 {
//
////    @Override
////    public void configure(AuthenticationManagerBuilder authenticationmanagerBuilder) throws Exception {
////        authenticationmanagerBuilder.inMemoryAuthentication()
////                .withUser("eureka").password("password")
////                .authorities("USER");
////    }
//
//    @Value("${eureka.username}")
//    private String username;
//    @Value("${eureka.password}")
//    private String password;
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
////                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .username(username)
//                .password(password)
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }
//
//
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated())
//                .httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }
//
//
////    @Override
////    public void configure(HttpSecurity httpSecurity) throws Exception {
////        httpSecurity.csrf(AbstractHttpConfigurer::disable)
////                .authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated())
////                .httpBasic(Customizer.withDefaults());
////    }
//
//
//
//
//}
