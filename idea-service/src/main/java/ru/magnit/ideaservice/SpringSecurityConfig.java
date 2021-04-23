//package ru.magnit.ideaservice;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
////import ru.magnit.ideaservice.service.AccountDetailsService;
//
//@Configuration
//@EnableWebSecurity
//
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
////    AccountDetailsService accountDetailsService;
////    @Override
////    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(accountDetailsService).passwordEncoder(passwordEncoder());
////    }
////
////
////    @Bean
////    PasswordEncoder passwordEncoder() {
////    return new BCryptPasswordEncoder();
////    }
////
////
////    @Override
////    protected void configure(final HttpSecurity http) throws Exception {
////        http
////                .csrf().disable()
////                .authorizeRequests()
////                .antMatchers("/admin/**").hasRole("ADMIN")
////                .antMatchers("/login*").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .loginPage("/login.html")
////                .loginProcessingUrl("/perform_login")
////                .defaultSuccessUrl("/homepage.html", true)
////                .failureUrl("/login.html?error=true")
////                .and()
////                .logout()
////                .logoutUrl("/perform_logout")
////                .deleteCookies("JSESSIONID");
////    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest().fullyAuthenticated()
//                .and()
//                .formLogin().loginProcessingUrl("localhost:3000/login");
//    }
//
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .ldapAuthentication()
//                .userDnPatterns("uid={0},ou=people")
//                .groupSearchBase("ou=groups")
//                .contextSource()
//                .url("ldap://localhost:8399/dc=springframework,dc=org")
//                .and()
//                .passwordCompare()
//                //.passwordEncoder(new BCryptPasswordEncoder())
//                .passwordAttribute("userPassword");
//    }
//}
