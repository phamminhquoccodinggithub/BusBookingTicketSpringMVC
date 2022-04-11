/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Account;
import com.mycompany.service.AccountService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Quoc
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/register")
    public String registerView(Model model){
        model.addAttribute("account", new Account());
        return "register";
    }
    @PostMapping("/register")
    public String registerHandler(Model model,
            @ModelAttribute(value = "account")@Valid Account account,
            BindingResult result){
        if(result.hasErrors() == true)
            return "register";
        String errMsg;
        if(account.getPassword().equals(account.getConfirmPassword())){
            if(this.accountService.addAccount(account) == true)
                return "redirect:/";
            else
                errMsg = "Something wrong! Please comeback later";
        }else{
            errMsg = "Password does not match!";
        }
        model.addAttribute("errMsg", errMsg);
        return "register";
        
    }
    @GetMapping("/login")
    public String loginView(){
        return "login";
    }
}
