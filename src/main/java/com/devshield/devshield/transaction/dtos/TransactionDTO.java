package com.devshield.devshield.transaction.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.devshield.devshield.account.dtos.AccountDTO;
import com.devshield.devshield.enums.TransactionStatus;
import com.devshield.devshield.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

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
public class TransactionDTO {

    private Long id;

    private BigDecimal amount;

    private TransactionType transactionType;

    private LocalDateTime transactionDate;

    private String description;

    private TransactionStatus status;

    @JsonBackReference
    private AccountDTO account;

    //for transfer
    private String sourceAccount;
    private String destinationAccount;

}
