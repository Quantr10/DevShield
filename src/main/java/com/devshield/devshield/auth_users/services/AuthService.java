package com.devshield.devshield.auth_users.services;

import com.devshield.devshield.auth_users.dtos.LoginRequest;
import com.devshield.devshield.auth_users.dtos.LoginResponse;
import com.devshield.devshield.auth_users.dtos.RegistrationRequest;
import com.devshield.devshield.auth_users.dtos.ResetPasswordRequest;
import com.devshield.devshield.res.Response;

public interface AuthService {
    Response<String> register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<?> forgetPassword(String email);
    Response<?> updatePasswordViaResetCode(ResetPasswordRequest requestPasswordRequest);
}
