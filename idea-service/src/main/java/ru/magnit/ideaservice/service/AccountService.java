package ru.magnit.ideaservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.magnit.ideaservice.domain.Account;
import ru.magnit.ideaservice.repository.AccountRepository;

@Service
@AllArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;


    public Account findByEmail(String email) {

        return accountRepository.findByEmail(email);
    }
}
