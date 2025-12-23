package com.devshield.devshield.account.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devshield.devshield.account.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

    Optional<Account> findByAccountNumber(String accountNumber);

    List<Account> findByUserId(Long userId);
}
