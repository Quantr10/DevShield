package com.devshield.devshield.audit_dashboard.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.devshield.devshield.account.dtos.AccountDTO;
import com.devshield.devshield.auth_users.dtos.UserDTO;
import com.devshield.devshield.transaction.dtos.TransactionDTO;

public interface AuditorService {
    Map<String, Long> getSystemTotals();
    Optional<UserDTO> findUserByEmail(String email);
    Optional<AccountDTO> findAccountDetailsByAccountNumber(String accountNumber);
    List<TransactionDTO> findTransactionsByAccountNumber(String accountNumber);
    Optional<TransactionDTO> findTransactionById(Long transactionId);
    
}
