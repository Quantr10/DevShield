package com.devshield.devshield.transaction.dtos;

import java.math.BigDecimal;

import com.devshield.devshield.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionRequest {
    private TransactionType transactionType;
    private BigDecimal amount;
    private String accountNumber;
    private String description;
    private String destinationAccountNumber; //the receiving account number if it is a transfer
}
