package ru.magnit.ideaservice.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.magnit.ideaservice.domain.Account;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


//    @Service
//    @AllArgsConstructor
//    public class AccountDetailsService implements UserDetailsService {
//
//        private final AccountService accountService;
//        @Value("${admin-password}")
//        String adminPassword;
//        String adminHash = new BCryptPasswordEncoder(4).encode(adminPassword);
//
//        @Override
//        public UserDetails loadUserByUsername(String email) {
//            if (email.equals("admin"))
//                return new User(
//                    "admin", adminHash,
//                    true, true, true, true,
//                        Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN")));
//
//            // Вход от имени клиента
//            if (email.startsWith("admin#")) {
//                return new User(email.replace("admin#", ""), adminHash,
//                        true, true, true, true,
//                        Collections.singleton(new SimpleGrantedAuthority("ROLE_CONFIRMED")));
//            }
//
//            Account account = accountService.findByEmail(email);
//
//            Set<GrantedAuthority> roles = new SimpleGrantedAuthority("ROLE_" + account.status);
//
//            return User(account.email, account.password,
//                    account.isConfirmed(), // enabled
//                    true, true,
//                    !account.isDenied(), // accountNotLocked
//                    roles);
//        }
//
//    }
//}
