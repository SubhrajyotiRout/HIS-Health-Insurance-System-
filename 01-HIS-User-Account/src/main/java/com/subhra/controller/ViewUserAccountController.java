package com.subhra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.subhra.model.UserAccount;
import com.subhra.service.UserAccountManagementService;

public class ViewUserAccountController {

	@Autowired
	private UserAccountManagementService userAccountService;
	
	@RequestMapping
	public String editUserAccount(@RequestParam("aid") Integer userId, Model model ) {
		UserAccount a = userAccountService.getUserAccountById(userId);
		model.addAttribute("userAccount", a);
		return "userAccountInfo";
	
	}
	
	
}
