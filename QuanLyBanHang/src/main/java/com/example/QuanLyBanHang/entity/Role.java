package com.example.QuanLyBanHang.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.Permission;
import java.util.List;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String roleCode;
    private String roleName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private List<Permissons> permissionsList;
}
