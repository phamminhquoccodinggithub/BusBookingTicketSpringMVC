/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.mycompany.pojo.Account;
import com.mycompany.repository.AccountRepository;
import com.mycompany.service.AccountService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Quoc
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private Cloudinary cloudinary;

    @Override
    public boolean addAccount(Account account) {
        if (account.getFile() != null) {
            try {
                Map res = this.cloudinary.uploader().upload(account.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                account.setAvatar((String) res.get("secure_url"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        account.setPassword(this.passwordEncoder.encode(account.getPassword()));
        return this.accountRepository.addAccount(account);
    }
}
