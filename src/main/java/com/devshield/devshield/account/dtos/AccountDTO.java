package com.devshield.devshield.account.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.devshield.devshield.auth_users.dtos.UserDTO;
import com.devshield.devshield.enums.AccountStatus;
import com.devshield.devshield.enums.AccountType;
import com.devshield.devshield.enums.Currency;
import com.devshield.devshield.transaction.dtos.TransactionDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    
    private Long id;

    private String accountNumber;

    private BigDecimal balance;

    private AccountType accountType;
    
    @JsonBackReference// this will not be added to the account dto. It will be ignored because it is a back reference
    private UserDTO user;

    private Currency currency;

    private AccountStatus status;

    @JsonManagedReference // if helps avoid recursion loop by ignoring the AccountDTO withing the TransactionDTO
    private List<TransactionDTO> transactions;

    private LocalDateTime closedAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

