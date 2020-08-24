package com.subhra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.subhra.entity.UserAccountsEntity;
import com.subhra.model.UserAccount;
import com.subhra.repository.UserAccountRepository;

public class UserAccountManagementServiceImpl implements UserAccountManagementService {

	@Autowired
	private UserAccountRepository userAccountRepo;
	
	@Override
	public boolean saveUserAccount(UserAccount a) {
		UserAccountsEntity entity= new UserAccountsEntity();
		BeanUtils.copyProperties(entity, a);
		UserAccountsEntity savedEntity=userAccountRepo.save(entity);
		return savedEntity.getUserId() != null ;
	}

	@Override
	public List<UserAccount> getAllUserAccounts() {
		List<UserAccountsEntity> entities =userAccountRepo.findAll();
		List<UserAccount> userAccounts =new ArrayList<UserAccount>();
		return entities.stream().map(entity -> {
			UserAccount userAccount=new UserAccount();
			BeanUtils.copyProperties(entity, userAccounts);
			return userAccount;
		}).collect(Collectors.toList());
	}

	@Override
	public UserAccount getUserAccountById(Integer aid) {
		Optional<UserAccountsEntity> findById=userAccountRepo.findById(aid);
		if(findById.isPresent()) {
			UserAccountsEntity entity = findById.get();
			UserAccount a = new UserAccount();
			BeanUtils.copyProperties(entity, a);
			return a;
		}
		return null;
	}

	@Override
	public boolean updateUserAccount(UserAccount a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserAccount(Integer aid) {
		// TODO Auto-generated method stub
		return false;
	}

}
