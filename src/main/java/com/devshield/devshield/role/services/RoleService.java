package com.devshield.devshield.role.services;

import java.util.List;

import com.devshield.devshield.res.Response;
import com.devshield.devshield.role.entity.Role;

public interface RoleService {
    
    Response<Role> createRole(Role roleRequest);
    Response<Role> updateRole(Role roleRequest);
    Response<List<Role>> getAllRoles();
    Response<?> deleteRole(Long id);
}
