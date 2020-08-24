package com.subhra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.subhra.model.UserAccount;
import com.subhra.service.UserAccountManagementService;

@Controller
public class UserAccountInfoController {
	
	@Autowired
	private UserAccountManagementService service;
	
	@GetMapping(value= { "/","/userAccount"})
	public String loadForm(Model model) {
		UserAccount a=new UserAccount();
		model.addAttribute("AddUserForm", a);
		return "userAccountInfo";
	}
	
	public boolean handleCreateBtn(@ModelAttribute("userAccount") UserAccount a, Model model) {
		boolean isSaved=UserAccountManagementService.saveUserAccount(a);
		if(isSaved) {
			model.addAttribute("succMsg","UserAccount Saved");
		}else {
			model.addAttribute("errMsg","Failed to Save UserAccount");
		}
		return "userAccountInfo";
	}
	
	@GetMapping("/viewUserAccounts")
	public String handleViewUserAccountsLink(Model model) {
		return null;
	}
	
	
}
