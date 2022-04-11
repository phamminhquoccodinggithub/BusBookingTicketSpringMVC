/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.repository;

import com.mycompany.pojo.Account;

/**
 *
 * @author Quoc
 */
public interface AccountRepository {
    boolean addAccount(Account account);
    Account getAccountByUserName(String username);
}
