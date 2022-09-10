package com.lwl.taxpoc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class User extends BaseEntity{

    private String username;
    private String password;
    private List<Role> roles=new ArrayList<>();
    private boolean active;

}
