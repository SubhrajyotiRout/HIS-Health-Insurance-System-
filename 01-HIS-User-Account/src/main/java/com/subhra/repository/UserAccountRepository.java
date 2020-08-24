package com.subhra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.subhra.entity.UserAccountsEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountsEntity,Serializable> {

	@Query(value="Select UserName from UserAccountsEntity")
	public List<String> findUserName();
}
