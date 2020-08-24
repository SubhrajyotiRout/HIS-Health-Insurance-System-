package com.subhra.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhra.entity.UserRoleEntity;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity,Serializable> {

}
