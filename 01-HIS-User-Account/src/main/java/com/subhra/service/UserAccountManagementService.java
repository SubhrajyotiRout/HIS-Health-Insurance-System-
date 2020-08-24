package com.subhra.service;

import java.util.List;

import com.subhra.model.UserAccount;

public interface UserAccountManagementService {
	
	public boolean saveUserAccount(UserAccount a);
	
	public List<UserAccount> getAllUserAccounts();
	
	public UserAccount getUserAccountById(Integer aid);
	
	public boolean updateUserAccount(UserAccount a);
	
	public boolean deleteUserAccount(Integer aid);
	
	
	

}
