package com.devshield.devshield.transaction.services;

import java.util.List;

import com.devshield.devshield.res.Response;
import com.devshield.devshield.transaction.dtos.TransactionDTO;
import com.devshield.devshield.transaction.dtos.TransactionRequest;

public interface TransactionService {

    Response<?> createTransaction(TransactionRequest transactionRequest);

    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);

}
