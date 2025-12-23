package com.devshield.devshield.account.services;

import java.util.List;

import com.devshield.devshield.account.dtos.AccountDTO;
import com.devshield.devshield.account.entity.Account;
import com.devshield.devshield.auth_users.entity.User;
import com.devshield.devshield.enums.AccountType;
import com.devshield.devshield.res.Response;

public interface AccountService {

    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);

}
