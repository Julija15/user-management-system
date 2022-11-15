package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.entity.Role;

public class RoleService {

    private RoleService roleService;

    public Role save (Role role){
        roleService.save(role);
        return role;
    }
}
