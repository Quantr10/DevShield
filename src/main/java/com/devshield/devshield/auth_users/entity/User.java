package com.devshield.devshield.auth_users.entity;

import java.time.LocalDateTime;

import com.devshield.devshield.role.entity.Role;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.devshield.devshield.account.entity.Account;

@Entity
@Data
@Builder
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;

    @Email
    @Column(unique = true, nullable = false)
    @NotBlank(message = "Email is required")
    private String email;

    private String password;
    private String profilePictureUrl;
    private boolean active = true;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Account> accounts;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;
}
