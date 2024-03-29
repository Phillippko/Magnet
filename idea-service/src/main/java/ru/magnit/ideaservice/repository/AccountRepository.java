package ru.magnit.ideaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.magnit.ideaservice.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
}
