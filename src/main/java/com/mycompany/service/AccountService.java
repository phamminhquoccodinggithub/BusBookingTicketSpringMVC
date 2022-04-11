/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.pojo.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Quoc
 */
public interface AccountService extends UserDetailsService{
    boolean addAccount(Account account);
    Account getAccountByUserName(String username);
}
